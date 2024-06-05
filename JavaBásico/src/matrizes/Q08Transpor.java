package matrizes;

import java.util.Scanner;

public class Q08Transpor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][]= new int[2][2];
        int b[][]= new int[2][2];

        System.out.println("Digite os valores da Matriz A:");
        for (int l = 0; l < a.length; l++) {
            for (int c = 0; c < a[l].length; c++) {
                a[l][c] = sc.nextInt();
            }
        }

        for (int l = 0; l < a.length; l++) {
            for (int c = 0; c < a[l].length; c++) {
                b[l][c] = a[c][l];
            }
        }

        System.out.println("Matriz C:");
        for (int l = 0; l < b.length; l++) {
            for (int c = 0; c < b[l].length; c++) {
                System.out.printf("%2d",b[l][c]);
                if (c < b[l].length - 1) {
                    System.out.print(" ¦ ");
                }
            }
            System.out.println();
        }
    }
}
