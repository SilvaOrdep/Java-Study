package vetores;

import java.util.Scanner;

public class Q08Anagramas {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a="", b="",c ="";
		int cont=0;
		
		System.out.println("Digite duas palavras e verifique se uma é anagrama da outra:");
		a= sc.next();
		b= sc.next();
		c=b;
		
		for (int i = 0; i < a.length(); i++) {
			
			for (int j = 0; j < a.length(); j++) {
				if(a.charAt(i)==b.charAt(j)) {
					cont++;
					b = c.substring(0, j) + c.substring(j + 1);
				}
			}
		}
		if (cont==a.length()) {
			System.out.println(b+" é anagrama de "+a);
		} else {
			System.out.println(c+" é anagrama de "+a);
		}
	}
}
