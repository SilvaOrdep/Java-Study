package collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 ArrayList busca de um elemento é rápida, mas inserções e exclusões não são.
 Exemplo de aplicação: catálogo com os livros de sua biblioteca pessoal e cada obra inserida receber um
 número sequencial (que será usado para acesso) a partir de zero;
*/
public class ArrayListBasico {
    public static void main(String[] args) {
        exemplodeLista();
        exemplodeListaOrdemAscendente();
    }

    private static void exemplodeLista(){
        List<String> lista = new ArrayList<String>();
        lista.add("Pedro");
        lista.add("Marco");
        lista.add("Nathan");
        System.out.println(lista);
    }

    private static void exemplodeListaOrdemAscendente(){
        List<String> lista = new ArrayList<>();
        lista.add("Pedro");
        lista.add("Marco");
        lista.add("Nathan");
        Collections.sort(lista);
        System.out.println(lista);
    }
}
