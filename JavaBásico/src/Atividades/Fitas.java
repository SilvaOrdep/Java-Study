package Atividades;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Fitas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int acervo, pEst, iEst, pCli, iCli;
		float totalCli;
		System.out.println("Fichas totais do acervo:");
		acervo = leia.nextInt();
		System.out.println("Fichas atuais na Pituba:");
		pEst = leia.nextInt();
		System.out.println("Fichas atuais em Itapuã:");
		iEst = leia.nextInt();

		pCli = (acervo / 2) - pEst;
		iCli = (acervo / 2) - iEst;
		totalCli = ((pCli + iCli) * 100.F) / acervo;

		System.out.println("Fichas com clientes da Pituba:" + pCli);
		System.out.println("Fichas com clientes de Itapuã:" + iCli);
		System.out.println("Percentual total com os clientes:" + totalCli + "%");
		leia.close();
	}

}
