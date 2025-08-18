package abstractfactory;

public class CarroNissan extends Carro {

    private final String computadorDePonta;

    public CarroNissan(String modelo, String carroceria, String motor, String pintura, int ano, String computadorDePonta) {
        super(modelo, carroceria, motor, pintura, ano);
        this.computadorDePonta=computadorDePonta;
    }

    @Override
    public void ligar() {
        System.out.println("Utilizando o computador de ponta para dar ignição com enconomia de recursos do carro");
        System.out.println("Carro ligado!");
    }

    public String getComputadorDePonta() {
        return computadorDePonta;
    }
}
