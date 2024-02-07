package com.example.notificationsystem.handler;

import com.example.notificationsystem.model.notification.Notification;

public class SmsHandler extends NotificationHandler{
    @Override
    public NotificationHandlerResponse dispatch(Notification notification) {
        System.out.println("Sending out SMS");
        return new NotificationHandlerResponse();
    }
}
