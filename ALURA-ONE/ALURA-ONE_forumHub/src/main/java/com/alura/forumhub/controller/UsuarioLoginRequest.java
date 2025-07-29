package com.alura.forumhub.controller;

import jakarta.validation.constraints.NotBlank;

public record UsuarioLoginRequest(@NotBlank String email, @NotBlank String senha) {
}
