package atividades.interacaouser;

import java.util.Scanner;

public class Q07TesteParidadeWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=1;
		while (num!=0) {
			System.out.println("Digite um valor:");
			num = sc.nextInt();
			
			if(num==0) break;
			if(num%2!=0) System.out.println(num+" é Ímpar");
			if(num%2==0) System.out.println(num+" é Par");
		}
		sc.close();
	}
}