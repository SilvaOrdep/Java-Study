package listarepeticao;
import java.util.Scanner;
public class SomaImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b, soma;
		soma=0;
		System.out.println("Digite um valor para A e B, onde A<B:");
		a = sc.nextInt();
		b = sc.nextInt();
		while (a <= b) {
			if (a%2!=0) {
				soma+=a;
			} 
			a++; 
		}
		System.out.println(soma);
		sc.close();
	}
}
