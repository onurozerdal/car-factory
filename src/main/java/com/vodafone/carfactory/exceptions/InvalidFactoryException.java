package com.vodafone.carfactory.exceptions;

public class InvalidFactoryException extends IllegalArgumentException{

    public InvalidFactoryException() {
        super("Please enter car or other abstract");
    }
}
