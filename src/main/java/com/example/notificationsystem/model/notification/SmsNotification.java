package com.example.notificationsystem.model.notification;

import lombok.Data;

import java.util.Map;

@Data
public class SmsNotification extends Notification{
    String toNumber;
    public SmsNotification(Map<String, String> payload) {
        this.toNumber = payload.get("toNumber");
    }
}
