package Atividades;

import java.util.Scanner;

public class Moeda {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double moeda, real;

		System.out.println("Digite um valor em reais");
		real = leia.nextDouble();
		System.out.println("Escolha uma moeda:");
		System.out.println("1)Dólar 2)Libra 3)Peso");
		moeda = leia.nextDouble();

		if (moeda == 1) {
			System.out.print("valor em Dólar:" + real*1.87);
		} else if (moeda == 2) {
			System.out.print("valor em Libra:" + real*3.05);
		} else if (moeda == 3) {
			System.out.print("valor em Peso:" + real*1.4);
		}
		leia.close();
	}

}
