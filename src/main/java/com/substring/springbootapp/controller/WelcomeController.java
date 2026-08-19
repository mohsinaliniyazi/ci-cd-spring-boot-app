package com.substring.springbootapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/api/welcome")
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Welcome to the Spring Boot Application!");
    }
}
