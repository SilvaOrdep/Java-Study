package matrizes;

import java.util.Scanner;

public class Q05MultMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][]= new int[2][2];
        int b[][]= new int[2][2];
        int z[][]= new int[2][2];

        System.out.println("Digite os valores da Matriz A:");
        for (int l = 0; l < a.length; l++) {
            for (int c = 0; c < a[l].length; c++) {
                a[l][c] = sc.nextInt();
            }
        }
        System.out.println("Digite os valores da Matriz B:");
        for (int l = 0; l < b.length; l++) {
            for (int c = 0; c < b[l].length; c++) {
                b[l][c] = sc.nextInt();
            }
        }

        for (int l=0; l < z.length; l++){
            for (int c = 0; c < z[l].length; c++) {
                z[l][c]=a[l][c]*b[l][c];
            }
        }

        System.out.println("Matriz C:");
        for (int l = 0; l < z.length; l++) {
            for (int c = 0; c < z[l].length; c++) {
                System.out.printf("%2d",z[l][c]);
                if (c < z[l].length - 1) {
                    System.out.print(" ¦ ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}