package set.opbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<String>();
    }

    public void addPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavrasUnicas.remove(palavra);
    }

    public void verificarPalavra(String palavra) {
        if (palavrasUnicas.contains(palavra)) {
            System.out.println(palavra+" está no conjunto");
        } else {
            System.out.println(palavra+ " não está no conjunto");
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.addPalavra("Batata");
        conjunto.addPalavra("Celular");
        conjunto.addPalavra("Computador");
        conjunto.addPalavra("Teste");
        conjunto.addPalavra("Teste");

        conjunto.exibirPalavrasUnicas();

        conjunto.removerPalavra("Batata");

        conjunto.exibirPalavrasUnicas();

        conjunto.verificarPalavra("Mouse");
    }
}
