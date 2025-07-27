package com.alura.forumhub.controller;

import com.alura.forumhub.dto.request.CursoRequest;
import com.alura.forumhub.dto.response.CursoResponse;
import com.alura.forumhub.dto.response.TopicoResponse;
import com.alura.forumhub.model.Curso;
import com.alura.forumhub.repository.CursoRepository;
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
@RequestMapping("cursos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<CursoResponse> criar(@RequestBody @Valid CursoRequest cursoRequest, UriComponentsBuilder builder) {
        Curso curso = new Curso(cursoRequest);

        cursoRepository.save(curso);
        URI uri = builder.path("/cursos/{id}").buildAndExpand(curso.getId()).toUri();

        return ResponseEntity.created(uri).body(new CursoResponse(curso));
    }

    @GetMapping
    public ResponseEntity<Page<CursoResponse>> listar(Pageable paginacao) {
        Page<CursoResponse> cursos = cursoRepository.findAll(paginacao).map(CursoResponse::new);

        return ResponseEntity.ok(cursos);
    }

}
