package com.alura.forumhub.dto.response;

import com.alura.forumhub.model.Resposta;

import java.time.LocalDate;

public record RespostaResponse(
    Long id,
    String mensagem,
    LocalDate dataCriacao,
    UsuarioResponse autor,
    Long topicoId
) {

    public RespostaResponse(Resposta resposta) {
        this(
            resposta.getId(),
            resposta.getMensagem(),
            resposta.getDataCriacao(),
            new UsuarioResponse(resposta.getAutor()),
            resposta.getTopico().getId()
        );
    }
}