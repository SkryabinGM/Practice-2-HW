package org.example.converter;

public class Exchanger {
    public double exchange (double value, Type input, Type output){
        Converter inputConverter = findConverterByType(input);
        double valueInRUB = inputConverter.convertToRub(value);
        Converter outputConverter = findConverterByType(output);
        double finshValue = outputConverter.convertToCurency(valueInRUB);
        return finshValue;
    }

    private Converter findConverterByType (Type type) {
        if (type ==Type.USD){
            return new ExchangerUSD();
        }
        if (type ==Type.JPY){
            return new ExangerJPY();
        }
        if (type==Type.CNY){
            return new ExangerCNY();
        }
        throw new RuntimeException("Нет такого типа" + type);
    }
}
