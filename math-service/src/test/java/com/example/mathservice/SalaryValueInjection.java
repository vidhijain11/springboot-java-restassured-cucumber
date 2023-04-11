package com.example.mathservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SalaryValueInjection {
    @Value("${amount}")
    private int amount;

    public int getSalary() {
        return amount;
    }
}
