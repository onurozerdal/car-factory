package com.vodafone.carfactory.factoryProducers.abstractFactories;

import com.vodafone.carfactory.factoryProducers.abstractFactories.interfaces.Car;

public class Cabrio implements Car {
    @Override
    public String getType() {
        return "Cabrio Car has produced.";
    }
}
