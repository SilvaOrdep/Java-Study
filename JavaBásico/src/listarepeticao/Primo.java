package listarepeticao;

import java.util.Scanner;

public class Primo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtd, num, i;
		i = 1;
		qtd = 0;
		
		System.out.println("Digite um número para verificar se é ou não Primo:");
		num = sc.nextInt();
		
		while (i <= num) {
			if (num%i == 0) {
				qtd++;
			}
			i++;
		}
		
		if (qtd == 2) {
			System.out.println(num+" é Primo");
		} else {
			System.out.println(num+" não é Primo");
		}
		
		sc.close();
	}
}