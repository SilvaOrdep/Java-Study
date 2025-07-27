package com.alura.forumhub.dto.request;

import jakarta.validation.constraints.NotBlank;

public record CursoRequest(@NotBlank String nome, @NotBlank String categoria) {
}
