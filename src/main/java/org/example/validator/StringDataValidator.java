package org.example.validator;

public class StringDataValidator {
    public boolean validate(String first, String second) throws DataException {
        String validCharacter ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        if (first==null) {
            System.err.println("Сделано неправильно первое число null");
            throw new EmptyDataException(second);
        }
        if (second==null) {
            System.err.println("Сделано неправильно второе число null");
            throw new EmptyDataException(second);
        }
        if (first.isEmpty()){
            System.err.println("Сделано неправильно первое слово пустое");
            throw new EmptyDataException(first);
        }
        if (second.isEmpty()){
            System.err.println("Сделано неправильно второе слово пустое");
            throw new EmptyDataException(second);
        }


/*        if (!validCharacter.contains(String.valueOf(first))){
            System.out.println("Сделано неправильно, в первом слове введены запрешенные символы");
            return false;
        }
        if (!validCharacter.contains(String.valueOf(second))){
            System.out.println("Сделано неправильно, во втором слове введены запрешенные символы");
            return false;
        }*/
        for (int i = 0; i < first.length(); i++) {
            if (!validCharacter.contains(String.valueOf(first.charAt(i)))){
                System.out.println("Сделано неправильно, в первом слове введены запрешенные символы");
                throw new UnknownCharacterException(first);
            }
        }
        for (int i = 0; i < second.length(); i++) {
            if (!validCharacter.contains(String.valueOf(second.charAt(i)))){
                System.out.println("Сделано неправильно, во втором слове введены запрешенные символы");
                throw new UnknownCharacterException(second);
            }
        }
        if (first.equals(second)) {
            return true;
        }
        else {
            return false;
        }
    }
}

