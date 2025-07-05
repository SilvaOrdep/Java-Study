package com.alura.literalura.controller;

import com.alura.literalura.dto.LivroDTO;
import com.alura.literalura.service.AutorService;
import com.alura.literalura.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("literalura/livros")
public class LivroController {
    @Autowired
    LivroService livroService;
    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<LivroDTO> buscarLivros() {
        return livroService.obterLivros();
    }

    @GetMapping("/{titulo}")
    public LivroDTO buscarLivroPorTitulo(@PathVariable String titulo) {
        return livroService.buscarLivroPorTituloViaAPI(titulo);
    }

    @PostMapping("/deletarTodos")
    public void apagarTodos() {
        livroService.limparTabelaLivros();
        autorService.limparTabelaAutores();
    }




}
