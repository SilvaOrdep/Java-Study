package vetores;

import java.util.Scanner;

public class Q06Substituir {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int vet[] = new int[10];
		
		System.out.println("Digite um valor para (num): ");
		num = sc.nextInt();
		
		System.out.println("Digite os valores do array:");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == num) {
				System.out.println(num+" foi encontrado no vetor, no índice "+i);
			} 
		}
		// faltando mostrar a mensagem caso não tenha, eu n consegui
	}

}
