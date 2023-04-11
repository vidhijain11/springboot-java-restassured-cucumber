package com.example.mathservice.conditionOnQualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Toyota")
public class CarToyota implements Car {
    @Override
    public void run() {
        System.out.println("In car toyota. Speed more than 60");
    }
}
