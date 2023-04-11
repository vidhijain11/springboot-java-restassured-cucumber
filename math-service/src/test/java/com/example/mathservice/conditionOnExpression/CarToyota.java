package com.example.mathservice.conditionOnExpression;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression("${car.speed} >= 60")
public class CarToyota implements Car {
    @Override
    public void run() {
        System.out.println("In car toyota. Speed more than 60");
    }
}
