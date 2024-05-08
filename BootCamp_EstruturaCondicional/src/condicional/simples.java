package condicional;

import java.util.Scanner;

public class simples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double saldo=25.50, saque=0;
		
		System.out.println("Digite o saldo para saque:");
		saque = sc.nextDouble();
		
		if (saque < saldo) {
			saldo= saldo-saque;
			System.out.println("Parabéns, saque realizado! \nSeu saldo: R$"+saldo);
		}
			
		

	}

}
