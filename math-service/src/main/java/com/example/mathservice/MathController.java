package com.example.mathservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/sum/{n1}/{n2}")
    public MathResponse add(@PathVariable int n1, @PathVariable int n2){
        return new MathResponse(n1, n2, n1+n2);
    }
}
