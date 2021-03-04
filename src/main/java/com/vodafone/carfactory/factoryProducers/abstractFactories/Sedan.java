package com.vodafone.carfactory.factoryProducers.abstractFactories;

import com.vodafone.carfactory.factoryProducers.abstractFactories.interfaces.Car;

public class Sedan implements Car {
    @Override
    public String getType() {
        return "Sedan Car has produced.";
    }
}
