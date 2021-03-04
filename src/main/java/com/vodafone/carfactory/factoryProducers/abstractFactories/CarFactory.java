package com.vodafone.carfactory.factoryProducers.abstractFactories;

import com.vodafone.carfactory.exceptions.InvalidCarException;
import com.vodafone.carfactory.factoryProducers.abstractFactories.interfaces.Car;

public class CarFactory extends AbstractFactory {
    @Override
    public Car getCar(String car) {
        if ("cabrio".equalsIgnoreCase(car)) {
            return new Cabrio();
        } else if ("sedan".equalsIgnoreCase(car)) {
            return new Sedan();
        } else if ("hatchback".equalsIgnoreCase(car)) {
            return new Hatchback();
        }
        throw new InvalidCarException();
    }
}
