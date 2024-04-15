package Atividades;

import java.util.Scanner;

public class Inverter {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int p1, p2, p3, num;

		System.out.println("Digite um num de 3 algarismos:");
		num = leia.nextInt();

		p3 = num % 10;
		num = num / 10;
		p2 = num % 10;
		p1 = num / 10;

		System.out.println("Num invertido:" + p3 + p2 + p1);
		leia.close();
	}

}
