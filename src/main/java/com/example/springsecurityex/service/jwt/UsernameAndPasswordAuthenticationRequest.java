package com.example.springsecurityex.service.jwt;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UsernameAndPasswordAuthenticationRequest {
    private String username;
    private String password;
}
