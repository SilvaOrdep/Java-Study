package anatomiaclasses;

public class identação {

	public static void main(String[] args) {
		// Sem identação:
		int nota = 5;
		if (nota < 6)
		System.out.println("Reprovado");
		else if (nota == 6)
		System.out.println("Recuperação");
		else
		System.out.println("Aprovado");
		
		// Com identação:
		int media = 5;
		if (media < 6)
			System.out.println("Reprovado");
		else if (media == 6)
			System.out.println("Recuperação");
		else
			System.out.println("Aprovado");
		
		// Identar permite uma leitura mais ampla do código, podendo apresentar melhor a hierarquia dos códigos.
	}
}
