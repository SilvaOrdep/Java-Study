package construtores;

public class PortalAluno {
    public static void main(String[] args) {
        Aluno pedro = new Aluno("Pedro Silva", 100044254); // poderia ser somente "Aluno()", mas foi utlizado o construtor.

        pedro.setCurso("Engenharia de Software");

        System.out.println("Portal do Aluno:\n" +
                "\nAluno: " + pedro.getNome() + "\nMatrícula: " + pedro.getMatricula() + "\nCurso: " + pedro.getCurso());
    }
}
