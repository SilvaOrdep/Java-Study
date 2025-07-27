package com.alura.forumhub.dto.response;

import com.alura.forumhub.model.Curso;

public record CursoResponse(Long id, String nome, String categoria) {

    public CursoResponse(Curso curso) {
        this(curso.getId(), curso.getNome(), curso.getCategoria());
    }

}