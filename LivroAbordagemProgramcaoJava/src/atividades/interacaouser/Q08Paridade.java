package atividades.interacaouser;

import java.util.Scanner;
import javax.swing.*;

public class Q08Paridade {
	public static int paridade(int num) {
		int resultado = num % 2;
		return resultado;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = 0, paridade = 0;
		do {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
			paridade = paridade(num);

			if (paridade == 0)
				System.out.println(num + " é Par");
			if (paridade != 0)
				System.out.println(num + " é Ímpar");

			System.out.println("Deseja continuar ? \n1-Sim 0-Não");
			op = sc.nextInt();
		} while (op != 0);
		
		sc.close();
	}
}
