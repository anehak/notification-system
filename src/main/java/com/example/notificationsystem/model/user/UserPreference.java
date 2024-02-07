package com.example.notificationsystem.model.user;

import com.example.notificationsystem.model.notification.NotificationSchedule;
import com.example.notificationsystem.model.notification.NotificationType;
import lombok.Data;

import java.util.List;

@Data
public class UserPreference {
    List<NotificationType> preferredChannels;
    int maxNumberOfEmails;
    NotificationSchedule schedule;

}
