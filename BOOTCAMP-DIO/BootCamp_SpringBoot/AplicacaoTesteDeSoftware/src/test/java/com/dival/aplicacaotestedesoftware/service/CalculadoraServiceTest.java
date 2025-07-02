package com.dival.aplicacaotestedesoftware.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraServiceTest {

    private final CalculadoraService calculatorService = new CalculadoraService();

    @Test
    void testSoma() {
        assertEquals(6, calculatorService.soma(3, 3));
    }

    @Test
    void testSubtrai() {
        assertEquals(1, calculatorService.subtrai(3, 2));
    }

    @Test
    void testMultiplica() {
        assertEquals(6, calculatorService.multiplica(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2.5, calculatorService.divide(5, 2), 0.0001);
    }

    @Test
    void testDividePorZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.divide(5, 0);
        });
        assertEquals("Divisão por zero", exception.getMessage());
    }
}
