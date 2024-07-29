package com.enduser.config;

import com.enduser.constants.AppConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
@Slf4j
public class KafkaConsumerConfig {

    @KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC,groupId = AppConstants.GROUP_ID)
    public void updateLocation(String value) {
        log.info("Location mil gaya from delivery agent!,");
        System.out.println(value);
        System.out.println("\n Kafka\n Listener");
    }
}
