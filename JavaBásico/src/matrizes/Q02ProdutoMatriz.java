package matrizes;

import java.util.Scanner;

public class Q02ProdutoMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m[][]= new int[5][2];
        int produto=1;

        System.out.println("Digite os valores da Matriz:");
        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                m[l][c] = sc.nextInt();
            }
        }

        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                produto *= m[l][c];
            }
        }

        System.out.println("Matriz:");
        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                System.out.print(m[l][c]);
                if (c < m[l].length - 1) {
                    System.out.print(" ¦ ");
                }
            }
            System.out.println();
        }
        System.out.println("Produto dos elementos da Matriz: "+produto);
    }
}
