package com.example.notificationsystem.exception;

public class NotificationException extends RuntimeException {
    String message;
    public NotificationException(String message) {
        this.message = message;
    }
}
