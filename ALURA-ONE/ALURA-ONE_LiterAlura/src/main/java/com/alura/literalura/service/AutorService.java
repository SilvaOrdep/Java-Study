package com.alura.literalura.service;

import com.alura.literalura.model.Autor;
import com.alura.literalura.model.DadosAutor;
import com.alura.literalura.model.Livro;
import com.alura.literalura.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public void adicionarAutor(Autor autor, Livro livro) {
        autor.getLivros().add(livro);
        autorRepository.save(autor);
    }

    public List<Autor> getAutores() {
        return autorRepository.findAll();
    }

    public void limparTabelaAutores() {
        autorRepository.deleteAll();
    }


    // falta fazer uma converteListaEmAutorDTO

}
