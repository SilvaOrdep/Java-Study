package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoTryCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = "";
		int idade = 0;
		double altura = 0;

		try {
			System.out.println("Digite seu nome");
			nome = sc.next();

			System.out.println("Idade");
			idade = sc.nextInt();

			System.out.println("Altura");
			altura = sc.nextDouble();

			System.out.println("Nome: " + nome + "\nIdade: " + idade + "\naltura: " + altura);

		} catch (InputMismatchException e) {
			System.out.println("O campo só aceita números!");
			
		sc.close();
		}
	}
}
