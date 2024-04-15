package Atividades;

import java.util.Scanner;

public class ImpostoSal {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double salMin, sal, imposto;

		salMin = 1412;

		System.out.println("Digite seu salário:");
		sal = leia.nextDouble();

		if (sal <= 3 * salMin) {
			imposto = sal * 0.10;
			System.out.println("Imposto devido:" + imposto);
		} else if (sal > 3 * salMin && sal <= 10 * salMin) {
			imposto = sal * 0.20;
			System.out.println("Imposto devido:" + imposto);
		} else {
			imposto = sal * 0.30;
			System.out.println("Imposto devido:" + imposto);
		}
		leia.close();
	}

}
