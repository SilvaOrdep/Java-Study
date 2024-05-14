package vetores;

import java.util.Scanner;

public class Q04Intercalação {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[20];
		
		System.out.println("Digite 10 valores para A:");
		a[0] = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			if (a[i] > a[i - 1]) {
				a[i] = sc.nextInt();
			}
		}
		
		System.out.println("Digite 10 valores para B:");
		b[0] = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			if (b[i] > b[i - 1]) {
				b[i] = sc.nextInt();
			}
		}

	}
}
