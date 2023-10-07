package org.example.converter;

public class ExangerJPY implements Converter{

    public double convertToRub(double ue) {
        return ue*1.48;
    }

    public double convertToCurency(double rub) {
        return rub/1.48;
    }

    public Type getType() {
        return Type.USD;
    }
}