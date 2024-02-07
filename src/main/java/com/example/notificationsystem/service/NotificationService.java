package com.example.notificationsystem.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NotificationService {
    @Autowired
    private KafkaTemplate kafkaTemplate;
    //Send out events to Kafka, based upon priority, send to different topics
    public void sendNotification( Map<String, Object> payload) throws JsonProcessingException {
        kafkaTemplate.send("PO", "NotificationKey",
                    new ObjectMapper().writeValueAsString(payload));

    }
}
