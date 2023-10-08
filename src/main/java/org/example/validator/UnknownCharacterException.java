package org.example.validator;

public class UnknownCharacterException extends DataException {
    public UnknownCharacterException(String description){
        super(description);
    }
}
