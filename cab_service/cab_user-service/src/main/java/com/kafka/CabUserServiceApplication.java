package com.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CabUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabUserServiceApplication.class, args);
		System.out.println("CAB\n USER\n SERVICE");
	}

}
