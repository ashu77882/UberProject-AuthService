package com.example.UberProjects_AuthService.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PassengerSignupRequestDto {

    private String email;

    private String password;

    private String phoneNumber;

    private     String name;
}
