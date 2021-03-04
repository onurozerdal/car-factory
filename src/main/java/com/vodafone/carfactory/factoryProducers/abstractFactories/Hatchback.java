package com.vodafone.carfactory.factoryProducers.abstractFactories;

import com.vodafone.carfactory.factoryProducers.abstractFactories.interfaces.Car;

public class Hatchback implements Car {
    @Override
    public String getType() {
        return "Hatchback Car has produced.";
    }
}
