package com.GuiMontin.demo.controller;

import com.GuiMontin.demo.service.CalculadoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @PostMapping("/divisao/{a}/{b}")
    public ResponseEntity<Double> divisao(
            @PathVariable double a,
            @PathVariable double b) {
        return ResponseEntity.ok(calculadoraService.dividir(a, b));
    }
}
