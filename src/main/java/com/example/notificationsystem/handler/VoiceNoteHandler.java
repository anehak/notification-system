package com.example.notificationsystem.handler;

import com.example.notificationsystem.model.notification.Notification;

public class VoiceNoteHandler extends NotificationHandler {
    @Override
    public NotificationHandlerResponse dispatch(Notification notification) {
        System.out.println("Sending out Voice Note");
        return new NotificationHandlerResponse();
    }
}
