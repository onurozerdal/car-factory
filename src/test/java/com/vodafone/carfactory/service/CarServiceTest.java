package com.vodafone.carfactory.service;

import com.vodafone.carfactory.exceptions.InvalidCarException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CarServiceTest {

    @InjectMocks
    private CarService carService;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void get_shouldBeError_CarIsNull() {
        expectedException.expect(InvalidCarException.class);
        carService.get(null);
    }

    @Test
    public void get_shouldBeSuccess_CabrioScenario() {
        String result = carService.get("cabrio");
        Assert.assertEquals(result, "Cabrio Car has produced.");
    }

    @Test
    public void get_shouldBeSuccess_SedanScenario() {
        String result = carService.get("sedan");
        Assert.assertEquals(result, "Sedan Car has produced.");
    }

    @Test
    public void get_shouldBeSuccess_HatchbackScenario() {
        String result = carService.get("hatchback");
        Assert.assertEquals(result, "Hatchback Car has produced.");
    }
}