package com.alura.forumhub.model;

import com.alura.forumhub.dto.request.CursoRequest;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "Curso")
@Table(name = "cursos")
@Data
@NoArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String categoria;
    @OneToMany(mappedBy = "curso")
    private List<Topico> topicos;

    public Curso(@Valid CursoRequest curso) {
        this.nome = curso.nome();
        this.categoria = curso.categoria();
    }
}
