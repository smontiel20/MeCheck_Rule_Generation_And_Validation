package com.example.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class UppercaseStringConverter implements AttributeConverter<String, String> {
    public String convertToDatabaseColumn(String attribute) {
        return attribute == null ? null : attribute.toUpperCase();
    }

    public String convertToEntityAttribute(String dbData) {

        return dbData;
    }
}