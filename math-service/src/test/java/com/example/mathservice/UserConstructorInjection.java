package com.example.mathservice;

import org.springframework.stereotype.Component;

@Component
public class UserConstructorInjection {

    private Address address;
    private Salary salary;

    public UserConstructorInjection(Address address, Salary salary) {
        this.address = address;
        this.salary = salary;
    }

    public void getUserDetails(){
        System.out.println(address.getStreet());
        System.out.println(salary.getSalary());
    }
}
