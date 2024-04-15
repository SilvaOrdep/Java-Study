package Atividades;

import java.util.Scanner;

public class Postosmedia {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double p1, p2, p3, media;

		System.out.println("Valor da gasolina posto 1:");
		p1 = leia.nextDouble();
		System.out.println("Valor da gasolina posto 2:");
		p2 = leia.nextDouble();
		System.out.println("Valor da gasolina posto 3:");
		p3 = leia.nextDouble();

		media = (p1 + p2 + p3) / 3;

		System.out.print("Média dos 3 postos: " + media);
		leia.close();
	}

}