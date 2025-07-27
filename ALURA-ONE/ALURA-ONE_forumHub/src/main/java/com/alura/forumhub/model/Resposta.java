package com.alura.forumhub.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity(name = "Resposta")
@Table(name = "respostas")
@Data
public class Resposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensagem;
    @ManyToOne
    @JoinColumn(name = "id_topico")
    private Topico topico;
    private LocalDate dataCriacao;
    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Usuario autor;

}
