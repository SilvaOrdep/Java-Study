package abstractfactory;

public interface FabricaDeVeiculoAbstrata {
    Carro criarCarro(String modelo, String carroceria, String motor, String pintura, int ano);

}
