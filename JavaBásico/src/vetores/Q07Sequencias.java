package vetores;

import java.util.Scanner;

public class Q07Sequencias {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k, t2 = 0, controle=0;
		int v1[] = new int[10];
		int v2[] = new int[t2];

		System.out.println("Digite os valores do vetor:");
		for (int i = 0; i < v1.length; i++) {
			v1[i] = sc.nextInt();
		}

		for (int i = 0; i < v1.length; i++) {

			for (k = 0; k < v1.length; k++) {
				if (v1[i] == v2[k]) {
					controle=1;
					break;
				}
			} 
			if (controle==0){
				v2[t2] = v1[i];
				t2++;
			}
			controle=0;
		}

		for (int i = 0; i < v2.length; i++) {
			System.out.println(v2[i]);
		}
	}
}
