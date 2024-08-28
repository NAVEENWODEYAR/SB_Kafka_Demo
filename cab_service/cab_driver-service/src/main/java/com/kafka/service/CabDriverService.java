package com.kafka.service;

import com.kafka.constants.AppConstant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabDriverService {
	
	private static final Logger log = LoggerFactory.getLogger(CabDriverService.class);

    @Autowired
    private KafkaTemplate<String ,Object> kafkaTemplate;

    public boolean updateLocation(String location){
        kafkaTemplate.send(AppConstant.CAB_LOCATION,location);
        log.error(location);
        return true;
    }
}
