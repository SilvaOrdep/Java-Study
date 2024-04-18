package listarepeticao;

import java.util.Scanner;

public class Livros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lf, lr, la, fem, mas, maslr, tipo, sexo;
		fem = 0;
		mas = 0;
		
		maslr = 0;
		
		lf = 0;
		lr = 0;
		la=0;
		
		do {
		System.out.println("Qual tipo foi vendido ?");	
		System.out.println("1)Ficção 2)Romance 3)Aventura");
		tipo = sc.nextInt();
		
		System.out.println("Sexo do comprador - 1)Feminino 2)Masculino");
		sexo = sc.nextInt();
		
		if (tipo == 1) {
			lf++;
		} else if (tipo == 2) {
			lr++;
		} else if (tipo == 3) {
			la++;
		}
		
		if (sexo == 1) {
			fem++;
		} else if (sexo == 2) {
			mas++;
		}
		
		if (tipo == 2 && sexo == 2) {
			maslr++;
		}
		
		} while (tipo != 0);
		
		tipo = lf+lr+la;
		sexo = fem+mas;
		
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println("Percentual de venda de cada livro (aproximadamente):");
		System.out.println("Ficção = "+(lf*100/tipo)+"%");
		System.out.println("Romance = "+(lr*100/tipo)+"%");
		System.out.println("Aventura = "+(la*100/tipo)+"%");
		
		System.out.println("Percentual de homens que leem romance (aproximadamente) = "+(maslr*100/sexo)+"%");
		
		sc.close();
	}
}
