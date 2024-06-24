package banco.conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Conta Corrente");
        super.imprimirExtrato();
    }
}
