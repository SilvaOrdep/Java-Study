package com.alura.forumhub.dto.response;

import com.alura.forumhub.model.Curso;
import com.alura.forumhub.model.Topico;
import com.alura.forumhub.model.Usuario;

public record TopicoResponse(Long id, String titulo, String mensagem, String status, UsuarioResponse usuarioResponse, CursoResponse cursoResponse) {

    public TopicoResponse(Topico topico, Usuario usuario, Curso curso){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getStatus(), new UsuarioResponse(usuario), new CursoResponse(curso));
    }

    public TopicoResponse(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getStatus(), new UsuarioResponse(topico.getAutor()), new CursoResponse(topico.getCurso()));
    }

}
