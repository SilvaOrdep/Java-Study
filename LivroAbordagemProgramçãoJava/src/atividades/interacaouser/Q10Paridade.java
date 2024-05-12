package atividades.interacaouser;

import java.util.Scanner;

public class Q10Paridade {
	public static boolean paridade(int num) {
		if (num%2==0) {
			return  true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int num=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: true=par false=ímpar");
		num = sc.nextInt();
		
		System.out.println(paridade(num));
			
		sc.close();
	}
}
