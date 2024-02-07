package com.example.notificationsystem.consumer;

import com.example.notificationsystem.exception.NotificationException;
import com.example.notificationsystem.handler.NotificationHandlerFactory;
import com.example.notificationsystem.handler.NotificationHandlerResponse;
import com.example.notificationsystem.handler.NotificationStatus;
import com.example.notificationsystem.model.notification.Notification;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {
    @KafkaListener(topics = {"#{'${app.kafka.consumer.topic}'}"})
    public void consume(ConsumerRecord<String, String> record) {
        Notification notification;
        try {
            notification = new ObjectMapper().readValue(record.value(), Notification.class);
        } catch (JsonProcessingException e) {
            throw new NotificationException("Notification Parsing failed");
        }
        if (notification == null || notification.getNotificationType() == null) {
            throw new NotificationException("[ValidationError] Notification type is mandatory");
        }

        Notification notificationPayload = NotificationHandlerFactory.createNotification(notification.getPayload(),
                notification.getNotificationType());

        NotificationHandlerResponse response = NotificationHandlerFactory.createNotificationHandler(notification.getNotificationType())
                .dispatch(notificationPayload);

        if (NotificationStatus.FAILED == response.getStatus()) {
            throw new NotificationException(
                    String.format("Failed to dispatch notification for request: %s", notification.getNotificationId()));
        }
    }
}
