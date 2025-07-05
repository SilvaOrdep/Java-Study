package com.alura.literalura.service;

import com.alura.literalura.dto.AutorDTO;
import com.alura.literalura.dto.LivroDTO;
import com.alura.literalura.model.Autor;
import com.alura.literalura.model.DadosAutor;
import com.alura.literalura.model.DadosLivro;
import com.alura.literalura.model.Livro;
import com.alura.literalura.repository.AutorRepository;
import com.alura.literalura.repository.LivroRepository;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;
    @Autowired
    private AutorRepository autorRepository;
    private ConsumoGutendexAPI apiLivro = new ConsumoGutendexAPI();
    private ConverteDados conversor = new ConverteDados();
    @Autowired
    private AutorService autorService;

    public LivroDTO buscarLivroPorTituloViaAPI(String titulo) {
        try {
            String json = apiLivro.ObterDadosPorTitulo(titulo);

            Gson gson = new Gson();
            JsonObject respostaAPI = gson.fromJson(json, JsonObject.class);

            if (respostaAPI.has("results")) {
                JsonArray resultsArray = respostaAPI.getAsJsonArray("results");

                for (JsonElement elemLivro : resultsArray) {
                    JsonObject jLivro = elemLivro.getAsJsonObject();
                    JsonArray autoresArray = jLivro.getAsJsonArray("authors");
                    String jsonLivro = elemLivro.toString();

                    List<Autor> autoresDoLivro = new ArrayList<>();

                    for (JsonElement elemAutor : autoresArray) {
                        String jAutor = elemAutor.toString();

                        DadosAutor dadosAutor = conversor.obterDados(jAutor, DadosAutor.class);

                        List<Autor> autoresExistentes = autorRepository.findByNome(dadosAutor.nome());

                        Autor autor;
                        if (!autoresExistentes.isEmpty()) {
                            autor = autoresExistentes.get(0); // Pega o primeiro resultado
                        } else {
                            autor = new Autor(dadosAutor);
                            autorService.adicionarAutor(autor);
                        }

                        autoresDoLivro.add(autor);
                    }

                    DadosLivro dadosLivro = conversor.obterDados(jsonLivro, DadosLivro.class);
                    Livro livro = new Livro(dadosLivro);
                    livro.setAutores(autoresDoLivro);

                    livroRepository.save(livro);
                    return obterPorId(livro.getId());
                }
            }

            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private LivroDTO obterPorId(Long id) {
        Optional<Livro> livro = livroRepository.findById(id);

        if (livro.isPresent()) {
            Livro l = livro.get();
            List<AutorDTO> autoresDTO = l.getAutores().stream()
                    .map(autor -> new AutorDTO(autor.getId(), autor.getAnoNascimento(),
                            autor.getAnoFalecimento(), autor.getNome()))
                    .collect(Collectors.toList());
            return new LivroDTO(l.getId(), l.getTitulo(), autoresDTO);
        }

        return null;
    }

    public List<LivroDTO> obterLivros() {
        return converterListaEmDTO(livroRepository.findAll());
    }

    public void limparTabelaLivros() {
        livroRepository.deleteAll();
    }

    private List<LivroDTO> converterListaEmDTO(List<Livro> livros) {
        return livros.stream()
                .map(l -> {
                    List<AutorDTO> autoresDTO = l.getAutores().stream()
                            .map(autor -> new AutorDTO(autor.getId(), autor.getAnoNascimento(),
                                    autor.getAnoFalecimento(), autor.getNome()))
                            .collect(Collectors.toList());
                    return new LivroDTO(l.getId(), l.getTitulo(), autoresDTO);
                })
                .collect(Collectors.toList());
    }
}
