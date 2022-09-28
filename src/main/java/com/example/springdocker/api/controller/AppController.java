package com.example.springdocker.api.controller;

import com.example.springdocker.application.service.AppService;
import com.example.springdocker.domain.model.valueobjects.PessoaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AppController {

    @Autowired
    AppService service;

    @GetMapping
    public String home() {
        return "Hello Docker World";
    }

    @GetMapping("/teste")
    public ResponseEntity<PessoaVO> teste(){
        return ResponseEntity.ok(service.consulta());
    }



}
