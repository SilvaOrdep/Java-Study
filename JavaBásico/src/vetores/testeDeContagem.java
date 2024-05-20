package vetores;

public class testeDeContagem {

	public static void main(String[] args) {
		

	}
	
	static String contador(String x) {
		char cont[] = new char[x.length()];
		for (int i = 0; i < cont.length; i++) {
			cont[i] = x.charAt(i);
		}
		return x;
	}

}
