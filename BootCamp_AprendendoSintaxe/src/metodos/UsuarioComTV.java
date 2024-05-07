package metodos;

public class UsuarioComTV {

	public static void main(String[] args) {
		ObjetoTV tv = new ObjetoTV();
		
		System.out.println("Tv ligada: "+tv.ligada);
		System.out.println("Canal: "+tv.canal);
		System.out.println("Volume: "+tv.volume);
		
		tv.ligar(); // function que liga a tv;
		System.out.println("\nTv ligada: "+tv.ligada);
		
		tv.selecionarCanal(1); // mudar canal
		System.out.println("\nCanal: "+tv.canal);
		tv.dimunuirCanal();
		System.out.println("\nCanal: "+tv.canal);
		tv.dimunuirCanal(); // canal vai estar no 0 e não será possível diminuir mais.
		
		tv.diminuirV();
		System.out.println("\nVolume: "+tv.volume);
		tv.diminuirV(); // vai para 0
		System.out.println("\nVolume: "+tv.volume);
		tv.diminuirV(); // não irá diminuir mais, pois já está no mudo.
		
		tv.desligar();
		System.out.println("\nTv ligada: "+tv.ligada);
	}
}
