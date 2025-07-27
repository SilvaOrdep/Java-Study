package com.alura.forumhub.controller;

import com.alura.forumhub.dto.request.TopicoRequest;
import com.alura.forumhub.dto.request.TopicoUpdateRequest;
import com.alura.forumhub.dto.response.TopicoResponse;
import com.alura.forumhub.model.Curso;
import com.alura.forumhub.model.Topico;
import com.alura.forumhub.model.Usuario;
import com.alura.forumhub.repository.CursoRepository;
import com.alura.forumhub.repository.TopicoRepository;
import com.alura.forumhub.repository.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
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
@RequestMapping("topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<TopicoResponse> criar(@RequestBody @Valid TopicoRequest topicoRequest, UriComponentsBuilder uriBuilder) {
        Usuario usuario = usuarioRepository.findById(topicoRequest.idUsuario())
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado!"));

        Curso curso = cursoRepository.findById(topicoRequest.idCurso())
                .orElseThrow(() -> new EntityNotFoundException("Curso não encontrado!"));

        Topico topico = new Topico(topicoRequest, usuario, curso);
        topicoRepository.save(topico);

        URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();

        return ResponseEntity.created(uri).body(new TopicoResponse(topico, usuario, curso));
    }

    @GetMapping
    public ResponseEntity<Page<TopicoResponse>> listar(Pageable paginacao) {
        Page<TopicoResponse> topicos = topicoRepository.findAll(paginacao).map(TopicoResponse::new);

        return ResponseEntity.ok(topicos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TopicoResponse> obterTopico(@PathVariable Long id) {
        Topico topico = topicoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Tópico não encontrado"));

        return ResponseEntity.ok(new TopicoResponse(topico));
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<TopicoResponse> atualizar(@PathVariable Long id, @RequestBody
    TopicoUpdateRequest topicoUpdateRequest) {
        Topico topico = topicoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Tópico não encontrado"));

        topico.atualizar(topicoUpdateRequest);

        return ResponseEntity.ok(new TopicoResponse(topico));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deletar(@PathVariable Long id) {
        Topico topico = topicoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Tópico não econtrado"));

        topicoRepository.delete(topico);

        return ResponseEntity.noContent().build();
    }


}
