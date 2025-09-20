package com.example.UberProjects_AuthService.repositories;

import com.example.UberProjects_AuthService.models.Driver;
import com.example.UberProjects_AuthService.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {


}
