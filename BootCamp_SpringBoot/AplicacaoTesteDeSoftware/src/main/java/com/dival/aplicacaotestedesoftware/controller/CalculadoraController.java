package com.dival.aplicacaotestedesoftware.controller;

import com.dival.aplicacaotestedesoftware.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping("/soma")
    public ResponseEntity<Integer> soma(@RequestParam int a, @RequestParam int b) {
        int resultado = calculadoraService.soma(a, b);
        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/divisao")
    public ResponseEntity<Double> divisao(@RequestParam int a, @RequestParam int b) {
        double resultado = calculadoraService.divide(a, b);
        return ResponseEntity.ok(resultado);
    }
}