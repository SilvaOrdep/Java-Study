package com.dival.aplicacaotestedesoftware.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public int soma(int a, int b) {
        return a + b;
    }

    public int subtrai(int a, int b) {
        return a - b;
    }

    public int multiplica(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero");
        }
        return (double) a / b;
    }
}

