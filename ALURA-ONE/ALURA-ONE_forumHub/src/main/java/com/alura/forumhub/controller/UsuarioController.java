package com.alura.forumhub.controller;

import com.alura.forumhub.dto.request.UsuarioRequest;
import com.alura.forumhub.dto.response.UsuarioResponse;
import com.alura.forumhub.model.Usuario;
import com.alura.forumhub.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<UsuarioResponse> criar(@RequestBody @Valid UsuarioRequest usuarioRequest, UriComponentsBuilder uriBuilder) {
        Usuario usuario = new Usuario(usuarioRequest);
        usuarioRepository.save(usuario);

        URI uri = uriBuilder.path("/usuarios/{id}").buildAndExpand(usuario.getId()).toUri();

        return ResponseEntity.created(uri).body(new UsuarioResponse(usuario));
    }

    @GetMapping
    public ResponseEntity<Page<UsuarioResponse>> listar(Pageable paginacao) {
        Page<UsuarioResponse> usuarios = usuarioRepository.findAll(paginacao).map(UsuarioResponse::new);

        return ResponseEntity.ok(usuarios);
    }

}
