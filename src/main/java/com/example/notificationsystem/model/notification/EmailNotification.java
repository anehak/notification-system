package com.example.notificationsystem.model.notification;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@EqualsAndHashCode(callSuper = true)
public class EmailNotification extends Notification {
    String sourceEmailId;
    String destinationEmailId;
    String subject;
    List<String> cc;
    public EmailNotification(Map<String, String> payload) {
        this.sourceEmailId = payload.get("sourceEmailId");
        this.destinationEmailId = payload.get("destinationEmailId");
        this.subject = payload.get("subject");
        this.cc = new ArrayList<>(cc);
    }
}
