package atividades.interacaouser;

import java.util.Scanner;

public class Q01AlterarSenha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cont = 0;
		String user, password, novaPass;
		novaPass = "";

		System.out.println("Login" + "\n" + "\nUsuário:");
		user = sc.next();

		System.out.println("Senha:");
		password = sc.next();

		for (int op = 1; op > 0; op--) {
			password = "";
			System.out.println("Deseja trocar sua senha?" + "\n1-Sim  0-Não");
			op = sc.nextInt();

			if (op == 1) {
				System.out.println("Digite a nova senha:");
				password = sc.next();
				System.out.println("Confirme a nova senha:");
				novaPass = sc.next();
				cont++;
			}
		}

		if (password.equals(novaPass) && cont == 1) {
			System.out.println("\n" + "Senha alterada com sucesso sr(a) " + user);
		} else {
			System.out.println("\n" + "Nova senha não confirmada sr(a) " + user);
		}

		sc.close();
	}

}
