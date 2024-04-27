package exerciciosdolivro;

import java.util.Scanner;

public class DadosDoUser {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name, lastname, adress;
	int num = 0;
	
	System.out.println("Digite seu nome e após ENTER, digite o sobrenome:");
	name = sc.next();
	lastname = sc.next();
	
	System.out.println("Digite seu Endereço:");
	adress = sc.nextLine();
	adress = sc.nextLine();
	
	System.out.println("Digite o número da casa:");
	num = sc.nextInt();
	
	System.out.println("");
	System.out.println(lastname+", "+name+": "+adress+", "+num);
	
	sc.close();
	}

}
