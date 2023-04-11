package com.example.mathservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSetterInjection {

    private Address address;
    private Salary salary;

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    @Autowired
    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public void getUserDetails(){
        System.out.println(address.getStreet());
        System.out.println(salary.getSalary());
    }
}
