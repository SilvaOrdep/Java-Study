package matrizes;

import java.util.Scanner;

public class Q0607Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][]= new int[4][4];
        int diagPrincipal=0, diagSecundaria=0, k=0;


        System.out.println("Digite os valores da Matriz A:");
        for (int l = 0; l < a.length; l++) {
            for (int c = 0; c < a[l].length; c++) {
                a[l][c] = sc.nextInt();
            }
        }

        for (int l = 0; l < a.length; l++) {
            diagPrincipal += a[l][k];
            k++;
        }

        k=3;
        for (int l = 0; l < a.length; l++) {
            diagSecundaria += a[l][k];
            k--;
        }

        System.out.println("Matriz C:");
        for (int l = 0; l < a.length; l++) {
            for (int c = 0; c < a[l].length; c++) {
                System.out.printf("%2d",a[l][c]);
                if (c < a[l].length - 1) {
                    System.out.print(" ¦ ");
                }
            }
            System.out.println();
        }

        System.out.println("Soma dos elementos da diagonal principal: "+diagPrincipal+"\ndiagonal Secundária: "+diagSecundaria);

        System.out.println();
    }
}
