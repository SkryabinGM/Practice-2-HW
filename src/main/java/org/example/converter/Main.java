package org.example.converter;

public class Main {
    public static void main(String[] args) {
        Exchanger test1 = new Exchanger(100, Type.JPY, Type.RUB);
        System.out.println(test1);
    }
}
