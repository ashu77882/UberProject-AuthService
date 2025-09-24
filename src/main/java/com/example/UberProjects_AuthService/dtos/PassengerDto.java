package com.example.UberProjects_AuthService.dtos;

import com.example.UberProject_EntityService.models.Passenger;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerDto {

    private String id;

    private String name;

    private String email;

    private String password;

    private String phoneNumber;

    private Date createdAt;

    public static PassengerDto from(Passenger p){
        return PassengerDto.builder()
                .id(p.getId().toString())
                .name(p.getName())
                .email(p.getEmail())
                .createdAt(p.getCreatedAt())
                .phoneNumber(p.getPhoneNumber())
                .password(p.getPassword())
                .build();
    }
}
