package com.example.app;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Divisor no puede ser cero");
        return a / b;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }


}