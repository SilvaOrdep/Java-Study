package poo.atividadesSegUnidade.classeAbstract.ContaBancaria;

public abstract class ContaBancaria {
    protected String senha;
    protected int numero, qtdTransacoes;
    protected double saldo;

    public ContaBancaria(String senha, int numero) {
        this.senha = senha;
        this.numero = numero;
        this.saldo = 0;
        this.qtdTransacoes = 0;
    }

    public abstract void sacar(double valor);

    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
            this.qtdTransacoes++;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Não foi possível realizar o depósito.");
        }
    }

    public abstract void tiraExtrato();
}
