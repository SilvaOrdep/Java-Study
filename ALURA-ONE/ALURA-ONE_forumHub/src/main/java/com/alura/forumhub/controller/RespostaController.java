package com.alura.forumhub.controller;

import com.alura.forumhub.dto.request.RespostaRequest;
import com.alura.forumhub.dto.request.RespostaUpdateRequest;
import com.alura.forumhub.dto.response.RespostaResponse;
import com.alura.forumhub.model.Resposta;
import com.alura.forumhub.model.Topico;
import com.alura.forumhub.model.Usuario;
import com.alura.forumhub.repository.RespostaRepository;
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
@RequestMapping("respostas")
public class RespostaController {

    @Autowired
    private RespostaRepository respostaRepository;

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<RespostaResponse> criar(@RequestBody @Valid RespostaRequest respostaRequest, UriComponentsBuilder uriBuilder) {
        Topico topico = topicoRepository.findById(respostaRequest.idTopico())
                .orElseThrow(() -> new EntityNotFoundException("Tópico não encontrado!"));

        Usuario autor = usuarioRepository.findById(respostaRequest.idAutor())
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado!"));

        Resposta resposta = new Resposta(respostaRequest, topico, autor);
        respostaRepository.save(resposta);

        URI uri = uriBuilder.path("/respostas/{id}").buildAndExpand(resposta.getId()).toUri();
        return ResponseEntity.created(uri).body(new RespostaResponse(resposta));
    }

    @GetMapping
    public ResponseEntity<Page<RespostaResponse>> listar(Pageable paginacao) {
        Page<RespostaResponse> respostas = respostaRepository.findAll(paginacao).map(RespostaResponse::new);
        return ResponseEntity.ok(respostas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RespostaResponse> obterResposta(@PathVariable Long id) {
        Resposta resposta = respostaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Resposta não encontrada"));

        return ResponseEntity.ok(new RespostaResponse(resposta));
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<RespostaResponse> atualizar(@PathVariable Long id, @RequestBody RespostaUpdateRequest respostaUpdateRequest) {
        Resposta resposta = respostaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Resposta não encontrada"));

        resposta.atualizar(respostaUpdateRequest);
        return ResponseEntity.ok(new RespostaResponse(resposta));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deletar(@PathVariable Long id) {
        Resposta resposta = respostaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Resposta não encontrada"));

        respostaRepository.delete(resposta);
        return ResponseEntity.noContent().build();
    }
}