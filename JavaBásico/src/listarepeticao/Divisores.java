package listarepeticao;

import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		i = 1;

		System.out.println("Digite um número e saiba seus divisores:");
		n = sc.nextInt();

		do {
			if (n % i == 0) {
				System.out.println(i + " é divisor de " + n);
			}
			i++;
		} while (i <= n);

		sc.close();
	}
}