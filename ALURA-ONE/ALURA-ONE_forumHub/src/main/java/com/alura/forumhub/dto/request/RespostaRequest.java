package com.alura.forumhub.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RespostaRequest(
    @NotBlank
    String mensagem,

    @NotNull
    Long idTopico,

    @NotNull
    Long idAutor
) {}