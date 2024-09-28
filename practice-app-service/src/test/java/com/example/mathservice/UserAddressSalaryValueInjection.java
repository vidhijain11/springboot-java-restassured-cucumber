package com.example.mathservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserAddressSalaryValueInjection {

    @Autowired
    private AddressValueInjection address;

    @Autowired
    private SalaryValueInjection salary;

    public void getUserDetails(){
        System.out.println(address.getStreet());
        System.out.println(salary.getSalary());
    }
}
