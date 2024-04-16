package ProblemaSemOO;

import java.util.Scanner;
public class Programa {
	
	public double a, b, c;
	public double areaFormula() {
		double p = (a + b + c) / 2.0;
		var area = (p * (p - a) * (p - b) * (p - c));
		
		return area;
	}

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		// usar um array pra guardar os abc de cada triangulo, dps ver uma forma de pegar cada indice
		
	}

}
