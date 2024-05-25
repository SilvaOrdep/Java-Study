package vetores;

import java.util.Scanner;

public class Q09SequenciasJuntas {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[] = new int[3];
		int b[] = new int[3];
		int c[] = new int[a.length+b.length];
		int d[] = new int[a.length+b.length];
		int j=0, controle=0, total=0;
	
		System.out.println("Digite a sequencia A:");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Digite a sequencia B:");
		for (int i = 0; i < b.length; i++) {
			b[i]=sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			c[j]=a[i];
			j++;
			c[j]=b[i];
			j++;
		}
		
		for (int i = 0; i < a.length; i++) {
		
			for (int k = 0; k < a.length; k++) {
				if (a[i]==b[k]) {
					controle=1;
					break;
				}
			}
			if (controle==0) {
				d[total]=a[i];
				total++;	
			}
			controle=0;
		}
		
		System.out.println("Sequencia C:");
		for (int i = 0; i < d.length; i++) {
			System.out.println(c[i]);
		}
		System.out.println("Sequencia D:");
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
	}
}
