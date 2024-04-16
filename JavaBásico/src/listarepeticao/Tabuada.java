package listarepeticao;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, i ;
		i= 0;
        System.out.println("Digite um número:");
        num = leia.nextInt();
		System.out.println("============");
		System.out.println("  TABUADA  ");
		System.out.println("============");		
		while (i <= 10) {
			System.out.println(num+"x"+i+"="+num * i);
			i++; 
		}
		leia.close();
	}

}
