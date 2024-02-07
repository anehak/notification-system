package com.example.notificationsystem.model.template;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class TemplateData {
    String templateName;
    Map<String, Object> payload;
}
