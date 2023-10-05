package org.example.converter;

public interface Converter {
    public void convertToRub(double ue);
    public void convertToCurency(double rub);
    Type getType();
}
