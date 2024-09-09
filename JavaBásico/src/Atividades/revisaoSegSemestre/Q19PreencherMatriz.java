package Atividades.revisaoSegSemestre;

import java.util.Scanner;

public class Q19PreencherMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do matriz: (min 2)");
        int size = sc.nextInt();

        int[][] matriz = new int[size][size];

        int ln=0, coluna=1, controlador=1;
        while(ln!=(size-1)){
            matriz[ln][coluna] = 1;
            coluna++;
            if(coluna==matriz[ln].length){
                ln++;
                controlador++;
                if(controlador!=matriz[ln].length) {
                    coluna = controlador;
                }
            }
        }

        for (int l = 0; l < matriz.length; l++) {
            for (int col = 0; col < matriz[l].length; col++) {
                System.out.printf("%2d",matriz[l][col]);
                if (col < matriz[l].length - 1) {
                    System.out.print(" ¦ ");
                }
            }
            System.out.println();
        }
    }
}
