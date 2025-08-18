package abstractfactory;

public class CarroHonda extends Carro {

    public CarroHonda(String modelo, String carroceria, String motor, String pintura, int ano) {
        super(modelo, carroceria, motor, pintura, ano);
    }

    @Override
    public void ligar() {
        System.out.println("ativando o motor de arranque");
        System.out.println("Carro ligado!");
    }

}
