package com.example.UberProjects_AuthService.controllers;

import com.example.UberProjects_AuthService.dtos.PassengerDto;
import com.example.UberProjects_AuthService.dtos.PassengerSignupRequestDto;
import com.example.UberProjects_AuthService.services.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private AuthService authService;

    public AuthController (AuthService authService){
        this.authService=authService;
    }

    @PostMapping("/signup/passenger")
    public ResponseEntity<PassengerDto> signup(@RequestBody PassengerSignupRequestDto passengerSignupRequestDto){
       PassengerDto response = authService.signupPassenger(passengerSignupRequestDto);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/signin/passenger")
    public ResponseEntity<?> signIn() {

        return new ResponseEntity<>(10, HttpStatus.CREATED);
    }
}
