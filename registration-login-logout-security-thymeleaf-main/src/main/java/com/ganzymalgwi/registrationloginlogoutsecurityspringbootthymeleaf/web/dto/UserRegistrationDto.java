package com.ganzymalgwi.registrationloginlogoutsecurityspringbootthymeleaf.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class UserRegistrationDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;


}
