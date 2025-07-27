package com.alura.forumhub.dto.response;

import com.alura.forumhub.model.Usuario;

public record UsuarioResponse(Long id, String nome, String email, String senha) {

    public UsuarioResponse(Usuario usuario) {
        this(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getSenha());
    }

}
