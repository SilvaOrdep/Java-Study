package construtores;

public class Aluno {
    private final String nome;
    private String curso;
    private final int matricula;

    // Construtor, apenas com os dados essenciais:
    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
