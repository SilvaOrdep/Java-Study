package matrizes;

import java.util.Scanner;

public class Q03EcontrarNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m[][]= new int[3][5];
        int num=0, controle=0;

        System.out.println("Digite os valores da Matriz:");
        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                m[l][c] = sc.nextInt();
            }
        }

        System.out.println("Digite um número para ser buscado na matriz");
        num = sc.nextInt();

        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                if (m[l][c] == num) {
                    System.out.println(num+" foi encontrado na linha "+(l+1)+" e coluna "+(c+1));
                    controle = 1;
                    break;
                }
            }
        }
        if (controle==0) {
            System.out.println(num+" não foi encontrado!");
        }

        System.out.println("Matriz:");
        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                System.out.printf("%2d",m[l][c]);
                if (c < m[l].length - 1) {
                    System.out.print(" ¦ ");
                }
            }
            System.out.println();
        }
    }
}
