package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<int[]> somaNumeros = new ArrayList<int[]>();

    public void adicionarNumero(int numero) {
        somaNumeros.add(new int[]{numero});
    }

    public int somarNum() {
        int soma = 0;
        for (int i = 0; i < somaNumeros.size(); i++) {
            soma += somaNumeros.get(i)[0];
        }
        return soma;
    }

    public int encontrarMaiorNum() {
        int maior = 0;
        for (int i = 0; i < somaNumeros.size(); i++) {
            if (somaNumeros.get(i)[0] > maior) {
                maior = somaNumeros.get(i)[0];
            }
        }
        return maior;
    }

    public int encontrarMenorNum() {
        int menor = somaNumeros.get(0)[0];
        for (int i = 0; i < somaNumeros.size(); i++) {
            if (somaNumeros.get(i)[0] < menor) {
                menor = somaNumeros.get(i)[0];
            }
        }
        return menor;
    }

    public void exibirNumeros() {
        for (int i = 0; i < somaNumeros.size(); i++) {
            System.out.println(somaNumeros.get(i)[0]);
        }

    }

    public static void main(String[] args) {
        SomaNumeros somaNum = new SomaNumeros();

        somaNum.adicionarNumero(3);
        somaNum.adicionarNumero(1);
        somaNum.adicionarNumero(2);

        System.out.println("Maior: " + somaNum.encontrarMaiorNum() + " Menor: " + somaNum.encontrarMenorNum());

        System.out.println("Soma de todos: " + somaNum.somarNum());

        somaNum.exibirNumeros();

    }
}
