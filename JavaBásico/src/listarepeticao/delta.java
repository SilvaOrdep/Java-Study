package listarepeticao;

import java.util.Scanner;

public class delta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		int sexo;
		
		do {
			System.out.println("Digite seu nome:");
			nome = sc.next();
			
			System.out.println("Selecione seu sexo - 1)Masculino 2)Feminino");
			sexo = sc.nextInt();
			
			if (nome.equals("Renan") || nome.equals("Delta")) {
				System.out.println("Seu nome é "+nome+" e você é VIADO!");
			} else {
				System.out.println("Seu nome é "+nome+" e seu sexo é da sua preferência cumpade");
			}
			
		} while (sexo != 0);


	}

}
