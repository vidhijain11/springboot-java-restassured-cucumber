package com.example.mathservice.conditionOnQualifier;

import com.example.mathservice.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.testng.annotations.Test;

public class TestCar extends SpringBaseTestNGTest {

    @Qualifier("Toyota")
    @Autowired
    private Car car;

    @Test
    public void runCar(){
        this.car.run();
    }
}
