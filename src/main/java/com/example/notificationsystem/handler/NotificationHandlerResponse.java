package com.example.notificationsystem.handler;

import lombok.Data;

@Data
public class NotificationHandlerResponse {
    Long notificationId;
    NotificationStatus status;
    String errorMessage;
}
