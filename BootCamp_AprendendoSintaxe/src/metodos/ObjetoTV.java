package metodos;

public class ObjetoTV {
	boolean ligada=false;
	int canal=1;
	int volume=2;
	
	public void ligar() {
		ligada=true;
	}
	public void desligar() {
		ligada=false;
	}
	
	public void aumentarCanal() {
		canal++;
	}
	public void dimunuirCanal() {
		if (canal > 0 ) {
			canal--;
		} else {
			System.out.println("Você não pode diminuir mais o canal!");
		}
	}
	public int selecionarCanal(int novoCanal) {
		canal = novoCanal;
		return canal;
	}
	
	public void diminuirV() {
		if (volume > 0 ) {
			volume--;
		} else {
			System.out.println("Volume já está mudo!");
		}
	}
	public void aumentarV() {
		volume++;
	}
	
}
