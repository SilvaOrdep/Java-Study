package com.alura.literalura.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoGutendexAPI {
    private String uri = "https://gutendex.com/books";

    public String ObterDadosPorTitulo(String tituloLivro) {
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest requisicao = HttpRequest.newBuilder().uri(URI.create(uri+"/?search="+tituloLivro.replace(" ","+"))).build();
        HttpResponse<String> resposta = null;
        try {
            resposta = cliente
                    .send(requisicao, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        return resposta.body();
    }

}
