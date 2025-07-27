package com.alura.forumhub.model;

import com.alura.forumhub.dto.request.RespostaRequest;
import com.alura.forumhub.dto.request.RespostaUpdateRequest;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity(name = "Resposta")
@Table(name = "respostas")
@Data
@NoArgsConstructor
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

    public Resposta(RespostaRequest respostaRequest, Topico topico, Usuario autor) {
        this.mensagem = respostaRequest.mensagem();
        this.topico = topico;
        this.autor = autor;
        this.dataCriacao = LocalDate.now();
    }

    public void atualizar(RespostaUpdateRequest respostaUpdateRequest) {
        if (respostaUpdateRequest.mensagem() != null) {
            this.mensagem = respostaUpdateRequest.mensagem();
        }
    }

}
