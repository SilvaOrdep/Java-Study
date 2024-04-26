package Atividades;

import java.util.Scanner;

public class FormaPagamento {

	/* 12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha
	 da forma de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da 
	 tabela de condições de pagamento para efetuar o cálculo adequado.
	 Tabela de Código de Condições de Pagamento
	 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
	 2 - À Vista no cartão de crédito, recebe 10% de desconto
	 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
	 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10% */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor=0, form=0;
		
		System.out.println("Digite o valor do produto:");
		valor = sc.nextDouble();
		
		System.out.println("Escolha a forma de pagamento: "
                + "\n1 - À Vista em Dinheiro ou Pix"
                + "\n2 - À Vista no cartão de crédito"
                + "\n3 - Parcelado no cartão em 2x"
                + "\n4 - Parcelado no cartão em 3x ou +");
		form = sc.nextDouble();
		
		if (form == 1) {
			System.out.println("Preço total à vista em dinheiro ou Pix: "+"R$"+(valor = valor-(valor*0.15)));
		} else if (form == 2) {
			System.out.println("Preço total à vista no cartão: "+"R$"+(valor-(valor*0.1))); 
		} else if (form == 3) {
			System.out.println("Preço total em até 2x no cartão: "+"R$"+valor);
		} else if (form == 4) {
			System.out.println("Preço total em 3x ou + (10% de juros): "+"R$"+(valor+(valor*0.1)));
		} else {
			System.out.println("Digite uma forma de pagamento válida.");
		}
		
		sc.close();
	}

}