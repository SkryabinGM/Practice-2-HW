package org.example.converter;

public class ExangerCNY implements Converter {

    public double convertToRub(double ue) {
        return ue*13;
    }
    public  double convertToCurency(double rub) {
        return rub/13;
    }
    public Type getType() {
        return Type.CNY;
    }
}
