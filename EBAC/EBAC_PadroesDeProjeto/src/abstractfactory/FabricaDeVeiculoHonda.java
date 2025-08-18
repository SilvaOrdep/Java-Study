package abstractfactory;

public class FabricaDeVeiculoHonda implements FabricaDeVeiculoAbstrata {

    @Override
    public Carro criarCarro(String modelo, String carroceria, String motor, String pintura, int ano) {
        return new CarroHonda(modelo, carroceria, motor, pintura, ano);
    }

    // poderia ter criarCaminhao, moto, etc...

}
