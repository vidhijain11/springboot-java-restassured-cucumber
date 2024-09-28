package com.example.mathservice;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private String street = "133 mt colony";

    public Address() {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }
}
