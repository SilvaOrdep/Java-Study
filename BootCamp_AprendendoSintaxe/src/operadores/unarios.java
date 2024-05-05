package operadores;

public class unarios {

	public static void main(String[] args) {
		// (+) (-) (++) (--)

		int num = 10; // +10 positivo
		System.out.println(num);

		num = -num; // -10 negativo
		System.out.println(num);

		num = num * -1; // +10
		num++; // 11 incremento
		System.out.println(num);

		num--; // +10 decremento
		System.out.println(num);
	}
}
