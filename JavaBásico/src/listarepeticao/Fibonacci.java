package listarepeticao;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, f, seq, num, qtd;
		qtd = 1;
		seq = 0;
		i = 0;
		f = 1;
		
		System.out.println("Quantos valores você deseja da sequência de Fibonacci?");
		num = sc.nextInt();
		
		System.out.println(f);
		do {
			seq = i + f;
			i = f;
			f = seq;
			System.out.println(seq);
			qtd++;
		} while (qtd < num);
		
		sc.close();
	}
}