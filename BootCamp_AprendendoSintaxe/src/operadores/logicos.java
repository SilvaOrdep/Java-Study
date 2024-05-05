package operadores;

public class logicos {

	public static void main(String[] args) {
		// (&&)-AND, (||)-OR
		
		boolean a=true,b=false;
		
		if (a && b) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		if (a && !b) {  // !-Não, logo nãoB se torna true
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		if (a || b) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
