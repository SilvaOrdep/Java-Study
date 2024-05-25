package atividades.interacaouser;

import java.util.Scanner;

public class Q04MarcarConsulta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op=0;
		do {
			System.out.println("Agendamento de consultas médicas \n "
					+ "\n1) Inserir novo paciente "
					+ "\n2) Inserir novo médico "
					+ "\n3) Marcar consulta "
					+ "\n4) Desmarcar consulta "
					+ "\nDigite 0(zero) para sair \n");
			op = sc.nextInt();

			if (op==1) System.out.println("Inserindo novo paciente");
			if (op==2) System.out.println("Inserindo novo médico");
			if (op==3) System.out.println("Marcando consulta");
			if (op==4) System.out.println("Desmarcando consulta");

		} while (op!=0);		
		
		System.out.println("Você saiu do sistema de agendamento de consultas!");	
		
		sc.close();
	}
}
