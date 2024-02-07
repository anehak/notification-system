package com.example.notificationsystem.handler;

import com.example.notificationsystem.model.notification.Notification;

public abstract class NotificationHandler {
    public abstract NotificationHandlerResponse dispatch(Notification notification);
}
