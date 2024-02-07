package com.example.notificationsystem.model.notification;

import java.util.Map;

public class VoiceNoteNotification extends Notification{
    String toNumber;
    public VoiceNoteNotification(Map<String, String> payload) {
        this.toNumber = payload.get("toNumber");
    }
}
