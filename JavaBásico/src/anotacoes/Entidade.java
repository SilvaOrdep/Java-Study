package anotacoes;

@Tabela(nome = "entidade")
public class Entidade {

    private String nome;

    public Entidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
