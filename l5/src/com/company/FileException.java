package com.company;

public class FileException extends RuntimeException {
    public FileException(String message,Exception e) {
        super(message,e);
    }
}