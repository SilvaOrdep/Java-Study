package poo.atividadesSegUnidade.classeAbstract.ContaBancaria;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String senha, int numero, double limite) {
        super(senha, numero);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if(valor > 0 && valor <= this.saldo + this.limite) {
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
        System.out.println("Limite: " + this.limite);
    }
}
