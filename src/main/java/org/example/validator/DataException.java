package org.example.validator;

public class DataException extends RuntimeException {
    public DataException(String description){
        super (description);
    }
}
