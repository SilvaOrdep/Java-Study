package listarepeticao;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, fat;
		fat = 0;
		System.out.println("Digite um numero para fatorial:");
		fat = sc.nextInt();
		num = fat - 1;
		do {
			fat = fat * num;
			num--;
		} while (num != 0);
		System.out.println(fat);
		
		sc.close();
	}
}