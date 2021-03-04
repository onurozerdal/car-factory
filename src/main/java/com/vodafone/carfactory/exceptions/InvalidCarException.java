package com.vodafone.carfactory.exceptions;

public class InvalidCarException extends IllegalArgumentException{

    public InvalidCarException() {
        super("Please enter Cabrio, Sedan or Hatchback");
    }
}
