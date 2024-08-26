package com.local.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @author Naveen K Wodeyar
 * @date 26-08-2024
 */
@SpringBootApplication
public class KafkaWikimediaConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaWikimediaConsumerApplication.class,args);
        System.out.println("\n*WIKIMEDIA\n       CONSUMER*\n");
    }
}
