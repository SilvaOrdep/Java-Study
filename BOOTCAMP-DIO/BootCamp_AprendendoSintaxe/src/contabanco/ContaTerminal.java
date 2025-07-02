package contabanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome="", agencia="";
		int numero=0;
		double saldo=0;
		
		System.out.println("Seja Bem vindo ao Banco Santander - Criar conta \nDigite seu nome:");
		nome = sc.next();
		System.out.println("Digite o número da conta:");
		numero = sc.nextInt();
		System.out.println("Digite a agência:");
		agencia = sc.next();
		System.out.println("Digite o saldo a ser depósitado:");
		saldo = sc.nextDouble();
	
		System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo R$"+saldo+
				" já está disponível para saque");
	}

}
