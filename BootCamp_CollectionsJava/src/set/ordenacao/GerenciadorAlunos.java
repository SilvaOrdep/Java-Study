package set.ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> gerenciadorDeAlunos;

    public GerenciadorAlunos() {
        gerenciadorDeAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        gerenciadorDeAlunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        for (Aluno aluno : gerenciadorDeAlunos) {
            if (aluno.getMatricula() == matricula) {
                gerenciadorDeAlunos.remove(aluno);
            }
        }
    }

    public Set<Aluno> exibirAlunosNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(gerenciadorDeAlunos);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        alunosPorNota.addAll(gerenciadorDeAlunos);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(gerenciadorDeAlunos);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        gerenciador.adicionarAluno("Pedro", 20084756, 8.5);
        gerenciador.adicionarAluno("Nathan", 20084124, 9.5);
        gerenciador.adicionarAluno("Andreson", 20084734, 9);
        gerenciador.adicionarAluno("Dival", 20084733, 9.9);

        gerenciador.removerAluno(20084733);

        gerenciador.exibirAlunos();
        System.out.println(gerenciador.exibirAlunosNome());
        System.out.println(gerenciador.exibirAlunosNota());

    }
}

class ComparatorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}
