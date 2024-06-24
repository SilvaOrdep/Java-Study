import banco.conta.Cliente;
import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Cliente pedro = new Cliente();
        pedro.setNome("Pedro");

        Conta cc = new ContaCorrente(pedro);
        Conta poupanca = new ContaPoupanca(pedro);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}