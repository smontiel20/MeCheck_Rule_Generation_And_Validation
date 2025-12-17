package com.example.converter;

import jakarta.persistence.AttributeConverter;

public class LowercaseStringConverter implements AttributeConverter<String, String> {
    public String convertToDatabaseColumn(String attribute) {
        return attribute == null ? null : attribute.toLowerCase();
    }

    public String convertToEntityAttribute(String dbData) {
        return dbData;
    }
}

