package com.kafka.controller;

import com.kafka.service.CabDriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/driver")
public class CabDriverController {

	public static final Logger log = LoggerFactory.getLogger(CabDriverController.class);
    @Autowired
    private CabDriverService cabDriverService;

    @GetMapping("/test")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<?> test(){
        log.error("Test endpoint accessed,");
        return ResponseEntity.ok("Welcome to CadDriverService!,");
    }

    @PutMapping
    public ResponseEntity<?> updateLocation() throws InterruptedException {

        int range = 500;
        while (range > 0){
            cabDriverService.updateLocation(Math.random()+","+Math.random());
            Thread.sleep(1000);
//            System.out.println(Math.random()+","+Math.random());
            range--;
        }
        log.warn("Sending location status using kafka,");
        return new ResponseEntity<>(Map.of("Location","Location Updated"),HttpStatus.OK);
    }


}
