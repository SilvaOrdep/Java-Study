package vetores;

import java.util.Scanner;

public class Q03IndicesImpares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vet[] = new int[10];

		System.out.println("Digite 10 valores para o vetor:");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}

		System.out.println("Números ímpares e seus índices:");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 != 0) {
				System.out.println("Índice: " + i + " número: " + vet[i]);
			}
		}
		sc.close();
	}
}
