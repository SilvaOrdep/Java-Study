package enums;

public enum EstadoBrasileiro {
    BAHIA("BA", "Bahia"),
    PARA("PA", "Pará"),
    SAO_PAULO("SP", "São Paulo"),
    ;

    private final String nome;
    private final String sigla;

    EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeUpper() {
        return nome.toUpperCase();
    }
}
