package com.deliveryagent.service;

import com.deliveryagent.config.AppConstants;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
	
	private static final Logger log = LoggerFactory.getLogger(KafkaService.class); 

    @Autowired
    private KafkaTemplate<String ,String> kafkaTemplate;

    public boolean updateLocation(String location) {
            this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
            log.error("Message produced in service!");
        return true;
    }
}
