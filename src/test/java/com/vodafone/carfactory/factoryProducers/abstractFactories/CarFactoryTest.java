package com.vodafone.carfactory.factoryProducers.abstractFactories;

import com.vodafone.carfactory.exceptions.InvalidCarException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CarFactoryTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void getFactory_shouldBeError_ChoiceIsNull() {
        expectedException.expect(InvalidCarException.class);
        CarFactory carFactory = new CarFactory();
        carFactory.getCar(null);
    }
}