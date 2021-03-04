package com.vodafone.carfactory.factoryProducers;

import com.vodafone.carfactory.exceptions.InvalidFactoryException;
import com.vodafone.carfactory.factoryProducers.abstractFactories.AbstractFactory;
import com.vodafone.carfactory.factoryProducers.abstractFactories.CarFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if("car".equalsIgnoreCase(choice)) {
            return new CarFactory();
        }
        throw new InvalidFactoryException();
    }
}
