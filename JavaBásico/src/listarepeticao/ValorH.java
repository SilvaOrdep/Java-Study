package listarepeticao;

public class ValorH {

	public static void main(String[] args) {
		
		double h = 0;
		double o = 1;
		
		for (double i = 1; i <= 100; i+=2) {
			System.out.println(i+"/"+o);
			h += i/o;
			o++;
		}
		
		System.out.println(h);
	}
}
