package com.alura.literalura.service;

import com.alura.literalura.dto.AutorDTO;
import com.alura.literalura.dto.LivroDTO;
import com.alura.literalura.model.Autor;
import com.alura.literalura.model.DadosAutor;
import com.alura.literalura.model.Livro;
import com.alura.literalura.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public void adicionarAutor(Autor autor) {
        autorRepository.save(autor);
    }

    public List<AutorDTO> obterAutores() {
        return converterListaEmDTO(autorRepository.findAll());
    }

    public List<AutorDTO> obterAutoresVivosNoAno(int ano) {
        return converterListaEmDTO(autorRepository.buscarVivosEmUmDeterminadoAno(ano));
    }

    public void limparTabelaAutores() {
        autorRepository.deleteAll();
    }

    private List<AutorDTO> converterListaEmDTO(List<Autor> autores) {
        return autores.stream()
                .map(autor -> new AutorDTO(autor.getId(), autor.getAnoNascimento(), autor.getAnoFalecimento(), autor.getNome()))
                .collect(Collectors.toList());
    }

}
