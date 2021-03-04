package com.vodafone.carfactory.controller;

import com.vodafone.carfactory.service.CarService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class CarControllerTest {

    @Mock
    private CarService carService;

    @InjectMocks
    private CarController carController;

    @Test
    public void get() {
        String result = "result";
        doReturn(result).when(carService).get("cabrio");
        ResponseEntity<String> response = carController.get("cabrio");
        Assert.assertEquals(result, response.getBody());
    }
}