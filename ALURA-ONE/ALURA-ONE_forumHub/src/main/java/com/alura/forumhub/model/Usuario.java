package com.alura.forumhub.model;

import com.alura.forumhub.dto.request.UsuarioRequest;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "Usuario")
@Table(name = "usuarios")
@Data
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;
    @Enumerated(EnumType.STRING)
    private Perfil perfil;
    @OneToMany(mappedBy = "autor")
    List<Resposta> respostas;
    @OneToMany(mappedBy = "autor")
    private List<Topico> topicos;

    public Usuario(@Valid UsuarioRequest usuarioRequest) {
        this.nome = usuarioRequest.nome();
        this.email = usuarioRequest.email();
        this.senha = usuarioRequest.senha();
        this.perfil = usuarioRequest.perfil();
    }

}
