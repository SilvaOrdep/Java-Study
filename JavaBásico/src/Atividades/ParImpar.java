package Atividades;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num;

		System.out.println("Digite um valor:");
		num = leia.nextInt();

		if ((num % 2) != 0) {
			System.out.println("Ímpar");
		} else {
			System.out.println("Par");
		}
		leia.close();
	}
}
