package com.example.notificationsystem.controller;

import com.example.notificationsystem.model.notification.Notification;
import com.example.notificationsystem.service.NotificationService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class NotificationController {

    @PostMapping("/notification/send")
    public ResponseEntity<Object> sendNotification(@RequestBody Map<String, Object> payload) {
        NotificationService notificationService = new NotificationService();
        try {
            notificationService.sendNotification(payload);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ResponseEntity.ok().build();
    }
}
