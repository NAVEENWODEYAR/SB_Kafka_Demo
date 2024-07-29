package com.deliveryagent.controller;

import com.deliveryagent.service.KafkaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/location")
@RequiredArgsConstructor
@Slf4j
public class LocationController {

    private final KafkaService kafkaService;

    @GetMapping
    public ResponseEntity<?> test(){
        log.warn("Test endPoint accessed");
        return ResponseEntity.ok("Welcome to Location\n Service");
    }

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
        for (int i = 0; i < 100000; i++) {
            kafkaService.updateLocation("("+Math.round(Math.random()*100)+","+Math.round(Math.random()*100)+",)");
            log.info("Arrived at node,"+i);
        }
        return new ResponseEntity<>(Map.of("message","Location updated"), HttpStatus.OK);
    }
}
