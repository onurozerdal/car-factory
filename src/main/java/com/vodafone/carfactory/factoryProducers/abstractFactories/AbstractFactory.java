package com.vodafone.carfactory.factoryProducers.abstractFactories;

import com.vodafone.carfactory.factoryProducers.abstractFactories.interfaces.Car;

public abstract class AbstractFactory {

    public abstract Car getCar(String car);

}
