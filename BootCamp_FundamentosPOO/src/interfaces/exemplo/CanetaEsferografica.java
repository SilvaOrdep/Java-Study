package interfaces.exemplo;

public class CanetaEsferografica implements Caneta {
    private String cor;

    public CanetaEsferografica(String cor) {
        this.cor = cor;
    }

    @Override
    public void escrever(String texto) {
        System.out.println(texto);
    }

    @Override
    public String getCor() {
        return this.cor;
    }
}
