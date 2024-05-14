package vetores;

import java.util.Scanner;

public class Q02SomaDeVetor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetA[] = new int[8];
		int vetB[] = new int[8];
		int vetC[] = new int[8];

		System.out.println("Digite 8 valores para o vetor A:");
		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = sc.nextInt();
		}
		System.out.println("Digite 8 valores para o vetor B:");
		for (int i = 0; i < vetA.length; i++) {
			vetB[i] = sc.nextInt();
		}

		for (int i = 0; i < vetC.length; i++) {
			vetC[i] = vetA[i] + vetB[i];
		}

		System.out.println("\nSoma dos índices de cada vetor em índices de um novo vetor:");
		for (int i = 0; i < vetC.length; i++) {
			System.out.println(i + 1 + "° valor: " + vetC[i]);
		}

		sc.close();
	}
}
