package vetores;

import java.util.Scanner;

public class Q05MaiorMenor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int v[] = new int[12];
		
		
		System.out.println("Digite os valores do vetor:");
		v[0] = sc.nextInt();
		int maior=0, menor = v[0];
		for (int i=1; i<v.length; i++) {
			v[i] = sc.nextInt();
			if (v[i] < menor) menor = v[i];
			if (v[i] > maior) maior = v[i];
		}
		for (int i = 0; i < v.length; i++) {
			if(v[i] == menor) System.out.println("Menor número: "+v[i]+" índice: "+i);
			if(v[i] == maior) System.out.println("Maior número: "+v[i]+" índice: "+i);
		}
		
		sc.close();
	}
}
