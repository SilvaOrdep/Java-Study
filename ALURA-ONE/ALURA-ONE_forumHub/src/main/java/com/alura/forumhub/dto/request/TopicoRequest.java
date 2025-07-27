package com.alura.forumhub.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TopicoRequest(@NotBlank String titulo, @NotBlank String mensagem, @NotNull Long idUsuario, @NotNull Long idCurso) {
}
