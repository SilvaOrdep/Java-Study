package matrizes;

import java.util.Scanner;

public class Q04MaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z[][] = new int[3][4];
        int lMaior=0, cMaior=0, lMenor=0, cMenor=0;

        System.out.println("Digite os valores da Matriz:");
        for (int l = 0; l < z.length; l++) {
            for (int c = 0; c < z[l].length; c++) {
                z[l][c] = sc.nextInt();
            }
        }

        int maior = z[0][0],menor = z[0][0];

        for (int l = 0; l < z.length; l++) {
            for (int c = 0; c < z[l].length; c++) {
                if (z[l][c] <= menor) {
                    menor = z[l][c];
                    lMenor = l;
                    cMenor = c;
                }
                if (z[l][c] >= maior) {
                    maior = z[l][c];
                    lMaior = l;
                    cMaior = c;
                }

            }
        }

        System.out.println("Matriz:");
        for (int l = 0; l < z.length; l++) {
            for (int c = 0; c < z[l].length; c++) {
                System.out.printf("%2d",z[l][c]);
                if (c < z[l].length - 1) {
                    System.out.print(" ¦ ");
                }
            }
            System.out.println();
        }
        System.out.println("Maior valor: " + maior+" linha: "+(lMaior+1)+" coluna: "+(cMaior+1)+"\n"
                +"Menor valor: " +menor+" linha: "+(lMenor+1)+" coluna: "+(cMenor+1));
    }
}
