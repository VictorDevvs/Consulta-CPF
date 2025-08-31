package com.example.demo.controller;

import com.example.demo.model.ApiResponse;
import com.example.demo.service.CPFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/validator")
public class CPFController {

    @Autowired
    private CPFService service;

    @GetMapping("/cpf")
    public Mono<ResponseEntity<ApiResponse>> validateCpf(@RequestParam String cpf){
        return service.validateCPF(cpf).map(ResponseEntity::ok);
    }
}
