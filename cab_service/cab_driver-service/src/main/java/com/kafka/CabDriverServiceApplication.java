package com.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CabDriverServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabDriverServiceApplication.class, args);
		System.out.println("CAB\n DRIVER\n SERVICE");
	}

}
