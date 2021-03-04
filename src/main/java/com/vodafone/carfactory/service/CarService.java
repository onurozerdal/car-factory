package com.vodafone.carfactory.service;

import com.vodafone.carfactory.factoryProducers.abstractFactories.AbstractFactory;
import com.vodafone.carfactory.factoryProducers.FactoryProducer;
import com.vodafone.carfactory.exceptions.InvalidCarException;
import com.vodafone.carfactory.factoryProducers.abstractFactories.interfaces.Car;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    public String get(String car) {
        if (StringUtils.isBlank(car)) {
            throw new InvalidCarException();
        }
        AbstractFactory abstractFactory = FactoryProducer.getFactory("car");
        Car abstractCar = abstractFactory.getCar(car);
        return abstractCar.getType();
    }
}
