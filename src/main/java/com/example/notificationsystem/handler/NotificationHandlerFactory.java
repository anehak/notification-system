package com.example.notificationsystem.handler;

import com.example.notificationsystem.model.notification.*;

import java.util.Map;

public class NotificationHandlerFactory {
    public static NotificationHandler createNotificationHandler(NotificationType type) {
        if (type == null)
            return null;
        return switch (type) {
            case SMS -> new SmsHandler();
            case EMAIL -> new EmailHandler();
            case VOICE -> new VoiceNoteHandler();
        };
    }

    public static Notification createNotification(Map<String, String> payload, NotificationType type) {
        if (type == null)
            return null;
        return switch (type) {
            case SMS -> new SmsNotification(payload);
            case EMAIL -> new EmailNotification(payload);
            case VOICE -> new VoiceNoteNotification(payload);
        };
    }
}
