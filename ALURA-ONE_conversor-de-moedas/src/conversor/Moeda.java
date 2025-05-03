package conversor;

public class Moeda {
    private double valor;
    private String tipo;

    public Moeda(double valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }
}
