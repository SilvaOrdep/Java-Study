package listarepeticao;

import java.util.Scanner;

public class EstadoCivil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sexo, idade, idf, estado, c, s, cont;
		cont = 0;
		idf = 0;
		c = 0;
		s = 0;
		
		do {
			
			System.out.println("Sexo: 1)Feminino 2)Masculino");
			sexo = sc.nextInt();
			System.out.println("Idade:");
			idade = sc.nextInt();
			System.out.println("Estado Civil: 1)Casado(a) 2)Solteiro(a)");
			estado = sc.nextInt();
			
			if (sexo == 1) {
				idf += idade;
			}
			
			if (estado == 1) {
				c++;
			} else {
				s++;
			}
			
			cont++;
		} while (cont != 5); // cont para quando 5 pessoas responderem ao todo.

		System.out.println("Média de idade das mulheres - "+(idf/5)+" anos");
		if (c > s) {
			System.out.println("Estado civil que mais ocorreu: Casado(a)");
		} else {
			System.out.println("Estado civil que mais ocorreu: Solteiro(a)");
		}
		
		sc.close();
	}

}
