package Atividades.revisaoSegSemestre;

import java.util.Scanner;

public class Q13Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int qtd=0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                qtd++;
            }
        }

        if (qtd == 2 && num>1) {
            System.out.println("Primo");
        } else {
            System.out.println("Nao Primo");
        }
    }
}
