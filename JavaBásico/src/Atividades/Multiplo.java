package Atividades;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int x, y;

		System.out.println("Digite um valor para x:");
		x = leia.nextInt();
		System.out.println("Digite um valor para y onde y<x:");
		y = leia.nextInt();

		if (x % y == 0) {
			System.out.println(y + " é multiplo de " + x);
		} else {
			System.out.println(y + " não é multiplo de " + x);
		}
		leia.close();
	}
	
}
