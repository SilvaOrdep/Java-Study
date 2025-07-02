package com.alura.literalura.service;

import com.alura.literalura.dto.LivroDTO;
import com.alura.literalura.model.Livro;
import com.alura.literalura.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public void adicionarLivro(Livro livro) {
        livroRepository.save(livro);
    }

    private List<LivroDTO> converterListaEmDTO(List<Livro> livros) {
        return livros.stream()
                .map(l -> new LivroDTO(l.getId(), l.getTitulo(), l.getAutores()))
                .collect(Collectors.toList());
    }
}
