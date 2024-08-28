package com.enduser.config;

import com.enduser.constants.AppConstants;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
@Slf4j
public class KafkaConsumerConfig {
	
	private static final Logger log = LoggerFactory.getLogger(KafkaConsumerConfig.class);

    @KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC,groupId = AppConstants.GROUP_ID)
    public void updateLocation(String value) {
        log.info("Location mil gaya from delivery agent!,");
        System.out.println(value);
        System.out.println("\n Kafka\n Listener");
        log.warn("Location mil gaya from delivery agent!,");
    }
}
