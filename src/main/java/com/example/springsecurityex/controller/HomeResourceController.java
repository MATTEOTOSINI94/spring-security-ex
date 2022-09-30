package com.example.springsecurityex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResourceController {

    @GetMapping(value = "/")
    public String home(){
        return "WELCOME";
    }

    @GetMapping(value = "/hr")
    public String hr(){
        return "WELCOME HR";
    }

    @GetMapping(value = "/hr-trainee")
    public String hrTraining(){
        return "WELCOME HR TRAINEE";
    }
}
