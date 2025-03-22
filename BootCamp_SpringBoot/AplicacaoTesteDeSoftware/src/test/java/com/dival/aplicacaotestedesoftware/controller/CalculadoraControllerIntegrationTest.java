package com.dival.aplicacaotestedesoftware.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class CalculadoraControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testSomaEndpoint() throws Exception {
        mockMvc.perform(get("/api/calculadora/soma")
                        .param("a", "4")
                        .param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("9"));
    }

    @Test
    void testDivisaoEndpoint() throws Exception {
        mockMvc.perform(get("/api/calculadora/divisao")
                        .param("a", "5")
                        .param("b", "2"))
                .andExpect(status().isOk())
                .andExpect(content().string("2.5"));
    }

    @Test
    void testDivisaoPorZeroEndpoint() throws Exception {
        mockMvc.perform(get("/api/calculadora/divisao")
                        .param("a", "5")
                        .param("b", "0"))
                .andExpect(status().isBadRequest())
                .andExpect(content().string("Divisão por zero"));
    }
}
