package org.example.converter;

public interface Converter {
    double convertToRub(double ue);
    double convertToCurency(double rub);
    Type getType();
}
