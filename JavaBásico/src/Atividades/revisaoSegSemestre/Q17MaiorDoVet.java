package Atividades.revisaoSegSemestre;

import java.util.Scanner;

public class Q17MaiorDoVet {
    public static void main(String[] args) {
        int A[] = new int[5];
        int maior;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        A[0] = sc.nextInt();
        maior = A[0];
        for(int i = 1; i < A.length; i++) {
            A[i] = sc.nextInt();
            if(A[i] > maior) {
                maior = A[i];
            }
        }
        System.out.println("Maior valor: " + maior);

    }
}
