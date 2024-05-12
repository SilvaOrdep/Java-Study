package atividades.interacaouser;

import javax.swing.JOptionPane;

public class Q06JOparidadeComRepeticao {

	public static void main(String[] args) {
		int num;
		do{
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
			
			if (num%2!=0) System.out.println(num+" é Ímpar");
			if (num%2==0) System.out.println(num+" é Par");
		} while (num!=0);	
	}
}