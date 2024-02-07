package com.example.notificationsystem.model.notification;

import com.example.notificationsystem.model.template.TemplateData;
import lombok.Data;

import java.util.Map;

@Data
public abstract class Notification {
    Long notificationId;
    NotificationType notificationType;
    String appName;
    Map<String, String> payload;
}
