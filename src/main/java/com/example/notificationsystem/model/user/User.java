package com.example.notificationsystem.model.user;

import lombok.Data;

@Data
public class User {
    Long userId;
    String userEmail;
    UserPreference userPreference;
}
