package com.example.web.exception;

public class SymbolNotFoundException extends  RuntimeException{
    public SymbolNotFoundException(String message) {
        super(message);
    }
}
