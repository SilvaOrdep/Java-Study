package atividades.interacaouser;

import javax.swing.*;

public class Q05JOparImpar {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		if (num%2!=0) System.out.println(num+" é Ímpar");
		if (num%2==0) System.out.println(num+" é Par");
	}
}