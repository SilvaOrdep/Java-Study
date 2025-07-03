package com.alura.literalura.service;

import com.alura.literalura.dto.LivroDTO;
import com.alura.literalura.model.Livro;
import com.alura.literalura.repository.AutorRepository;
import com.alura.literalura.repository.LivroRepository;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;
    @Autowired
    private AutorRepository autorRepository;
    private ConsumoGutendexAPI apiLivro = new ConsumoGutendexAPI();
    private ConverteDados conversor = new ConverteDados();

    public void obterLivroPorTituloViaAPI(String titulo) {

        try {
            String json = apiLivro.ObterDadosPorTitulo(titulo);

            Gson gson = new Gson();
            JsonObject respostaAPI = gson.fromJson(json, JsonObject.class);

            if (respostaAPI.has("results")) {
                JsonArray resultsArray = respostaAPI.getAsJsonArray("results");


            }

        } catch (Exception e) {

        }


    }

    private List<LivroDTO> converterListaEmDTO(List<Livro> livros) {
        return livros.stream()
                .map(l -> new LivroDTO(l.getId(), l.getTitulo(), l.getAutores()))
                .collect(Collectors.toList());
    }
}
