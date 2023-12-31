package org.example.converter;

public class ExchangerUSD implements Converter {

    public double convertToRub(double ue) {
        return ue*100;
    }

    public double convertToCurency(double rub) {
        return rub/100;
    }

    public Type getType() {
        return Type.USD;
    }
}
