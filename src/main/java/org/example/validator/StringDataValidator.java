package org.example.validator;

public class StringDataValidator {
    public boolean validate(String first, String second) throws DataException {
        String validCharacter ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        if (!validCharacter.contains(String.valueOf(first))){
            System.out.println("Сделано неправильно, в первом слове введены запрешенные символы");
            return false;
        }
        if (!validCharacter.contains(String.valueOf(second))){
            System.out.println("Сделано неправильно, во втором слове введены запрешенные символы");
            return false;
        }

        if (first.isEmpty()){
            System.err.println("Сделано неправильно первое слово пустое");
            return false;
        }
        if (second.isEmpty()){
            System.err.println("Сделано неправильно второе слово пустое");
            return false;
        }
/*        if (first==null) {
            System.err.println("Сделано неправильно первое число null");
            return false;
        }
        if (second==null) {
            System.err.println("Сделано неправильно второе число null");
            return false;
        }*/
        if (first.equals(second)) {
            return true;
        }
        else {
            return false;
        }
    }
}

