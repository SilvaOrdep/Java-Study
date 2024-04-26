package exerciciosdolivro;

import java.util.Scanner;

public class Cotacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cot = 0, dol = 100;
		System.out.println("Qual a cotação para o dia do Dólar hoje?");
		cot = sc.nextDouble();
		
		dol = dol * cot;
		
		System.out.println("100 Dólares equivalem à: R$"+dol);
		
		sc.close();
	}

}
