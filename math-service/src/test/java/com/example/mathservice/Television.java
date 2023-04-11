package com.example.mathservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Television {

    @Value("${tv.name:sony}")
    private String name;

    public Television() {
        System.out.println("Inside constructor : " + this.name);
    }

    @PostConstruct
    public void turnOnTv(){
        System.out.println("Inside post construct Turning on TV "+ this.name);
    }

    public void playMovie(){
        System.out.println("Playing movie");
    }

    @PreDestroy
    public void turnOffTv(){
        System.out.println("Inside pre destroy. Turning off TV");
    }
}
