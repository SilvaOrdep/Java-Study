package com.alura.forumhub.dto.request;

import com.alura.forumhub.model.Perfil;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UsuarioRequest(@NotBlank String nome, @NotBlank String email, @NotBlank String senha, @NotNull Perfil perfil) {
}
