package poo.atividadesSegUnidade.classeAbstract.ContaBancaria;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String senha, int numero) {
        super(senha, numero);
    }

    @Override
    public void sacar(double valor) {
        if(valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            this.qtdTransacoes++;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }
    }

    @Override
    public void tiraExtrato() {
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Quantidade de transações: " + this.qtdTransacoes);
    }
}
