package com.project.couriers.exception;

public class DataNotFoundException extends Exception {

    private String message;


    public DataNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}