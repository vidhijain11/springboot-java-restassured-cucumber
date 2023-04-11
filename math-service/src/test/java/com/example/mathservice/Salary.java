package com.example.mathservice;

import org.springframework.stereotype.Component;

@Component
public class Salary {

    private int amount =10000;

    public Salary() {
        this.amount = amount;
    }

    public int getSalary() {
        return amount;
    }
}
