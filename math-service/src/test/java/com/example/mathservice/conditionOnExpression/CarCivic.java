package com.example.mathservice.conditionOnExpression;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression("${car.speed} < 60")
public class CarCivic implements Car{
    @Override
    public void run() {
        System.out.println("In car civica. Speed less than 60");
    }
}
