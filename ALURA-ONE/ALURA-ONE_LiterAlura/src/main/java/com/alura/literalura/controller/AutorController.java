package com.alura.literalura.controller;

import com.alura.literalura.dto.AutorDTO;
import com.alura.literalura.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("literalura/autores")
public class AutorController {
    @Autowired
    AutorService autorService;

    @GetMapping
    public List<AutorDTO> buscarAutores() {
        return autorService.obterAutores();
    }

    @GetMapping("/vivos/{ano}")
    public List<AutorDTO> buscarAutoresVivosNoAno(@PathVariable int ano) {
        return autorService.obterAutoresVivosNoAno(ano);
    }

    @PostMapping("/deletarTodos")
    public void apagarTodos() {
        autorService.limparTabelaAutores();
    }

}
