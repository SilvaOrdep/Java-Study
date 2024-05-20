package vetores;

import java.util.Scanner;

public class Q08Anagramas {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a="", b="";
		int cont=0;
		
		System.out.println("Digite duas palavras e verifique se uma é anagrama da outra:");
		a= sc.next();
		b= sc.next();
		char marcada[] = new char[b.length()];
		
		for (int i = 0; i < a.length(); i++) {
			
			for (int j = 0; j < a.length(); j++) {
				if(a.charAt(i)==b.charAt(j)) {
					marcada[i] = b.charAt(j);
					break;
				}
			}
		}
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < a.length(); j++) {
				if (marcada[i]==b.charAt(j)) {
					cont++;
					marcada[i]-=i;
				}
			}
		}
		
		if (cont == a.length()) {
			System.out.println("anagrama");
		} else {
		System.out.println("não é anagrama");
		}
	}
}
