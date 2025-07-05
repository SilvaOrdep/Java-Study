package com.alura.literalura.dto;

import com.alura.literalura.model.Autor;

import java.util.List;

public record LivroDTO(Long id,
                       String titulo,
                       List<AutorDTO> autores) {
}
