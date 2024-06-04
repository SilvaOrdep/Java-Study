package matrizes;

import java.util.Scanner;

public class Q01SomaMatriz {
    public static void main(String[] args) {
        int[][] matriz1 = new int[3][2];
        int[][] matriz2 = new int[3][2];
        int[][] matriz3 = new int[3][2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores da matriz 1:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz 2:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz 3:");
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.print(matriz3[i][j]);
                if (j < matriz3[i].length - 1) {
                    System.out.print(" ¦ ");
                }
            }
            System.out.println();
        }
    }
}
