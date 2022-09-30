package com.example.springsecurityex.model;

import lombok.Getter;

@Getter
public enum ApplicationUserPermission {

    HR("ROLE_HR"),

    HR_TRAINEE("ROLE_HR_TRAINEE"),

    DEV("ROLE_DEV");


    private final String permission;

    ApplicationUserPermission(String permission){
        this.permission = permission;
    }



}
