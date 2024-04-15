package Atividades;

import java.util.Scanner;

public class Nadador {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;

		System.out.println("Digite sua Idade:");
		idade = leia.nextInt();

		if (idade > 7 && idade < 11) {
			System.out.println("Categoria: Infantil");
		} else if (idade > 10 && idade < 14) {
			System.out.println("Categoria: Juvenil A");
		} else if (idade > 13 && idade < 18) {
			System.out.println("Categoria: Juvenil B");
		} else if (idade >= 18) {
			System.out.println("Categoria: Senior");
		} else {
			System.out.println("Sua idade não se adequa!");
		}
		leia.close();
	}

}
