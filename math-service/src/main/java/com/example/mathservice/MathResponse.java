package com.example.mathservice;

public class MathResponse {

    int n1;
    int n2;
    int result;

    public MathResponse(int n1, int n2, int result) {
        this.n1 = n1;
        this.n2 = n2;
        this.result = result;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public int getResult() {
        return result;
    }
}
