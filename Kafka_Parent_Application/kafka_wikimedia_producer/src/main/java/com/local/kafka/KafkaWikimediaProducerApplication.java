package com.local.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @author Naveen K Wodeyar
 * @date 26-08-2024
 */
@SpringBootApplication
public class KafkaWikimediaProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaWikimediaProducerApplication.class,args);
        System.out.println("\n==WIKIMEDIA\n      PRODUCER==\n");
    }
}
