package matrizes;

import java.util.Scanner;

import java.util.Scanner;

public class Q05MultMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][]= new int[2][2];
        int b[][]= new int[2][2];


        System.out.println("Digite os valores da Matriz:");
        for (int l = 0; l < a.length; l++) {
            for (int c = 0; c < a[l].length; c++) {
                a[l][c] = sc.nextInt();
            }
        }




        System.out.println();
    }
}
