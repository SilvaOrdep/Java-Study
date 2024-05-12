package atividades.interacaouser;

import javax.swing.JOptionPane;

public class Q09JOparidadeMain {

	public static String paridade(int num) {
		if (num % 2 != 0) {
			return "O num " + num + " é Ímpar";
		} else {
			return "O num " + num + " é Par";
		}
	}

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

		JOptionPane.showMessageDialog(null, paridade(num));
	}
}
