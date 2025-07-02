package com.alura.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosAutor (@JsonAlias("birth_year") int anoNascimento, @JsonAlias("death_year") int anoFalecimento, @JsonAlias("name") String nome) {
}