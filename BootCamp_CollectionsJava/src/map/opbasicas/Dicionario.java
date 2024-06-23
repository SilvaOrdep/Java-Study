package map.opbasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionario.isEmpty()) {
            dicionario.remove(palavra);
        } else {
            System.out.println("Não foi possivel remover a palavra");
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionario);
    }

    public String pesquisarPalavras(String palavra) {
        String definicao = dicionario.get(palavra);
        if (definicao != null) {
            return definicao;
        }
        return "Não encontrado";
    }

    public static void main(String[] args) {
        Dicionario d = new Dicionario();

        d.adicionarPalavra("Mouse", "Periférico de entrada de um computador");
        d.adicionarPalavra("Teclado", "Periférico de entrada com teclas");
        d.adicionarPalavra("Mão", "Membro do corp humano");
        d.adicionarPalavra("Celular", "Dispositivo tecnológico móvel");
        d.adicionarPalavra("Hello", "Olá");
        d.adicionarPalavra("Hello", "Olá MUNDO!");

        d.exibirPalavras();

        d.removerPalavra("Celular");

        d.exibirPalavras();

        System.out.println(d.pesquisarPalavras("Mouse"));
    }
}
