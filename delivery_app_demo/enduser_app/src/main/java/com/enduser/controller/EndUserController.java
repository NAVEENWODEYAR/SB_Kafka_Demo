package com.enduser.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class EndUserController {

    @GetMapping
    public ResponseEntity<?> test(){
        return ResponseEntity.ok("Welcome to User service!,");
    }
}
