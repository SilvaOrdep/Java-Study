package listarepeticao;

import java.util.Scanner;

public class MenorValor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, cont;
		System.out.println("Digite um número:");
		num = sc.nextInt();
		cont = num;
		
		do {
			System.out.println("Digite um número:");
			num = sc.nextInt();
			if (cont > num && num != 0) {
				cont = num;
			}
		} while (num != 0);

		System.out.println("Menor valor do conjunto:" + cont);
		
		sc.close();
	} 
}