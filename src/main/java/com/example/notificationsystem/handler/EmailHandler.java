package com.example.notificationsystem.handler;

import com.example.notificationsystem.model.notification.Notification;

public class EmailHandler extends NotificationHandler{

    @Override
    public NotificationHandlerResponse dispatch(Notification notification) {
        System.out.println("Sending out an Email");
        return new NotificationHandlerResponse();
    }
}
