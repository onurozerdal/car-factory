package com.vodafone.carfactory.factoryProducers;

import com.vodafone.carfactory.exceptions.InvalidFactoryException;
import com.vodafone.carfactory.factoryProducers.abstractFactories.AbstractFactory;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FactoryProducerTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void getFactory_shouldBeError_ChoiceIsNull() {
        expectedException.expect(InvalidFactoryException.class);
        FactoryProducer.getFactory(null);
    }

    @Test
    public void getFactory_shouldBeSuccess() {
        AbstractFactory car = FactoryProducer.getFactory("car");
        Assert.assertNotNull(car);
    }
}