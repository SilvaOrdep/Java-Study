package listarepeticao;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade, sexo, cod, o1, o2, o3, o4, s1, s2, total;
		o1 = 0;
		o2 = 0;
		o3 = 0;
		o4 = 0;
		s1 = 0;
		s2 = 0;

		do {
			System.out.println("Digite sua idade:");
			idade = sc.nextInt();
			System.out.println("Selecione seu sexo:");
			System.out.println("1) Feminino   2) Masculino");
			sexo = sc.nextInt();
			System.out.println("Selecione seu objetivo");
			System.out.println("1)Compras 2)Serviços 3)Lazer 4)Alimentação");
			cod = sc.nextInt();

			if (cod == 1) {
				o1++;
			} else if (cod == 2) {
				o2++;
			} else if (cod == 3) {
				o3++;
			} else if (cod == 4) {
				o4++;
			}

			if (sexo == 1) {
				s1++;
			} else {
				s2++;
			}

		} while (cod != 5);

		total = o1 + o2 + o3 + o4;

		System.out.println("Percentual de busca de cada serviço (Aproximadamente):");
		System.out.println((o1 * 100 / total) + "% - Compras");
		System.out.println((o2 * 100 / total) + "% - Serviços (Banco, correio,etc.)");
		System.out.println((o3 * 100 / total) + "% - Lazer (Cinema, jogos,etc.)");
		System.out.println((o4 * 100 / total) + "% - Alimentação (restaurantes e lanchonetes)");
		idade = idade +1;
		total = s1+s2;
		
		System.out.println("Percentual de frequencia (Aproximadamente):");
		System.out.println("Mulheres: "+(s1*100/total)+"% Homens: "+(s2*100/total)+"%");
		
		sc.close();
	}

}
