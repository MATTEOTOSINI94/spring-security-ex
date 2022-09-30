package com.example.springsecurityex.service.jwt;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component
public class JwtConfig {

    @Value("${jwt.secretKey}")
    private String secretKey;

    @Value("${jwt.tokenPrefix}")
    private String tokenPrefix;

    @Value("${jwt.tokenExpirationAfterDays}")
    private String tokenExpirationAfterDays;


    public String getSecretKey() {
        return secretKey;
    }

    public String getTokenPrefix() {
        return tokenPrefix;
    }

    public String getTokenExpirationAfterDays() {
        return tokenExpirationAfterDays;
    }
}
