package com.example.UberProjects_AuthService.services;

import com.example.UberProjects_AuthService.models.Passenger;
import com.example.UberProjects_AuthService.repositories.PassengerRepository;
import com.example.UberProjects_AuthService.helpers.AuthPassengerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

// this class is responsible for loading the user in the form of UserDetails object for auth
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private PassengerRepository passengerRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Passenger> passenger =passengerRepository.findPassengerByEmail(email);
        if(passenger.isPresent()){
            return new AuthPassengerDetails(passenger.get());
        }else{
            throw new UsernameNotFoundException("Cannot find the given passenger by the given email...");
        }
    }
}
