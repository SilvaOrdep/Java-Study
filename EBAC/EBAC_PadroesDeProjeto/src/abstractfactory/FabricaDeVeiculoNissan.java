package abstractfactory;

public class FabricaDeVeiculoNissan implements FabricaDeVeiculoAbstrata {

    @Override
    public Carro criarCarro(String modelo, String carroceria, String motor, String pintura, int ano) {
        String computadorDePonta = escolherComputadorDePonta(modelo);

        return new CarroNissan(modelo, carroceria, motor, pintura, ano, computadorDePonta);
    }

    private String escolherComputadorDePonta(String modelo) {
        System.out.println("lógica com " + modelo);
        return "computadorDePonta";
    }

}
