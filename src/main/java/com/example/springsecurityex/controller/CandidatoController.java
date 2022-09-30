package com.example.springsecurityex.controller;

import com.example.springsecurityex.dto.CandidatoDTO;
import com.example.springsecurityex.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CandidatoController {

    @Autowired
    CandidatoService candidatoService;

    @GetMapping(value = "/api/get-candidati")
    private ResponseEntity<List<CandidatoDTO>> getAllCandidati(){
        return candidatoService.getAllCandidati();
    }
}
