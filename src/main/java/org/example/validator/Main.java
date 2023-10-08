package org.example.validator;

public class Main {
    public static void main(String[] args) {
        StringDataValidator stringDataValidator = new StringDataValidator();
        boolean test1 = stringDataValidator.validate("ABC", "ABC");
        boolean test2 = stringDataValidator.validate("ABC", "123");
        boolean test3 = stringDataValidator.validate("Привет", "Привет");
        boolean test4 = stringDataValidator.validate("", "привет");
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
    }
}
