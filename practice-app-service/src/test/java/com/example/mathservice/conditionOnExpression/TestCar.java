package com.example.mathservice.conditionOnExpression;

import com.example.mathservice.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class TestCar extends SpringBaseTestNGTest {

    @Autowired
    private Car car;

    @Test
    public void runCar(){
        this.car.run();
    }
}
