package org.example.converter;

public class Main {
    public static void main(String[] args) {
        Exchanger exchanger = new Exchanger();
        double valueCNY = exchanger.exchange(100, Type.USD, Type.CNY);
        System.out.println(valueCNY);
    }
}
