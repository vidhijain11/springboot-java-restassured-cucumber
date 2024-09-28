package com.example.mathservice.conditionOnQualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Civic")
public class CarCivic implements Car {
    @Override
    public void run() {
        System.out.println("In car civica. Speed less than 60");
    }
}
