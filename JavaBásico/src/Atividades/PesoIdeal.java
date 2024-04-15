package Atividades;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String sexo;
		double altura, pesoIdeal;

		System.out.println("Selecione seu sexo:");
		System.out.println("a)Feminino  b)Masculino");
		sexo = leia.next();

		if (sexo.equals("a") || sexo.equals("A")) {
			System.out.println("Digite sua altura:");
			altura = leia.nextDouble();
			pesoIdeal = 62.1 * altura - 44.7;
			System.out.println("Seu peso ideal é:" + pesoIdeal);
		} else if (sexo.equals("b") || sexo.equals("B")) {
			System.out.println("Digite sua altura:");
			altura = leia.nextDouble();
			pesoIdeal = 72.7 * altura - 44.7;
			System.out.println("Seu peso ideal é:" + pesoIdeal);
		} else {
			System.out.println("Digite uma opção válida!");
		}
		leia.close();
	}
}
