package com.example.mathservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AddressValueInjection {
    @Value("${street}")
    private String street;

    public String getStreet() {
        return street;
    }
}
