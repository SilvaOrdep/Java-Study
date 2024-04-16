package listarepeticao;

import java.util.Scanner;

public class QtdImparPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int impar, par, num;
		par = 0;
		impar = 0;

		do {
			System.out.println("Digite um número:");
			num = sc.nextInt();

			if (num % 2 == 0) {
				par++;
			} else if (num % 2 != 0 && num != -1) {
				impar++;
			}

		} while (num != -1);

		System.out.println("Quantidade de numeros impares:" + impar);
		System.out.println("Quantidade de numeros pares:" + par);

		sc.close();
	}
}