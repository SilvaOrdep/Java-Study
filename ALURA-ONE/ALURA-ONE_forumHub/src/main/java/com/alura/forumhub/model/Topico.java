package com.alura.forumhub.model;

import com.alura.forumhub.dto.request.TopicoRequest;
import com.alura.forumhub.dto.request.TopicoUpdateRequest;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "Topico")
@Table(name = "topicos")
@Data
@NoArgsConstructor
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDate dataCriacao;
    private String status;
    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Usuario autor;
    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;
    @OneToMany(mappedBy = "topico")
    private List<Resposta> respostas;

    public Topico(TopicoRequest topicoRequest, Usuario usuario, Curso curso) {
        this.titulo = topicoRequest.titulo();
        this.mensagem = topicoRequest.mensagem();
        this.dataCriacao = LocalDate.now();
        this.status = "Aberto";
        this.autor = usuario;
        this.curso = curso;
    }

    public void atualizar(TopicoUpdateRequest topicoUpdateRequest) {
        if (topicoUpdateRequest.titulo() != null) this.titulo = topicoUpdateRequest.titulo();
        if (topicoUpdateRequest.mensagem() != null) this.mensagem = topicoUpdateRequest.mensagem();
        if (topicoUpdateRequest.status() != null) this.status = topicoUpdateRequest.status();
    }

}
