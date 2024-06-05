package matrizes;

import java.util.Scanner;

public class Q09Aposta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int apostas[][]= new int[3][3];
        int resultado[][]= new int[3][3];
        int pontos=0, k=2, aposta=0, op=0, linhas=0, jogo=1;


        System.out.println("Sistema de Aposta: \n1-Fazer Aposta \n2-Sair");
        op=sc.nextInt();

        switch (op){
            case 1:
                do {
                    System.out.println("Digite a coluna da aposta para o jogo "+jogo);
                    aposta=sc.nextInt();
                    aposta--;
                    if ((aposta>=0)&&(aposta<3)){
                        apostas[linhas][aposta] = 1;
                        linhas++;
                        jogo++;
                    } else {
                        System.out.println("Digite uma coluna de aposta válida");
                    }
                } while (linhas<3);
        }

        for (int l = 0; l < resultado.length; l++) {
            resultado[l][k] = 1;
            k--;
        }

        for (int l = 0; l < apostas.length; l++) {
            for (int c = 0; c < apostas[l].length; c++) {
                if ((apostas[l][c]==resultado[l][c]) && (apostas[l][c]==1)) {
                    pontos++;
                }
            }
        }

        System.out.println("Sua aposta:");
        for (int l = 0; l < apostas.length; l++) {
            for (int c = 0; c < apostas[l].length; c++) {
                System.out.printf("%2d",apostas[l][c]);
                if (c < apostas[l].length - 1) {
                    System.out.print(" ¦ ");
                }
            }
            System.out.println();
        }
        System.out.println("Resultado:");
        for (int l = 0; l < resultado.length; l++) {
            for (int c = 0; c < resultado[l].length; c++) {
                System.out.printf("%2d",resultado[l][c]);
                if (c < resultado[l].length - 1) {
                    System.out.print(" ¦ ");
                }
            }
            System.out.println();
        }
        System.out.println("Pontos Marcados: "+pontos);
    }
}