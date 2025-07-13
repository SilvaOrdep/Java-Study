package poo.questoes;

public class Aluno {
	private Long matricula;
	private String nome;
	private Double nota1=0.0, nota2=0.0, notaTrabalho=0.0;
	private static final double pesoProva = 2.5, pesoTrabalho = 2, mediaCorte = 6.0;
	
	public Aluno(Long matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public Double media() {
		return ((getNota1()*pesoProva) + (getNota2()*pesoProva) + (getNotaTrabalho()*pesoTrabalho)) / ((pesoProva*2)+pesoTrabalho);
	}
	
	public Double provaFinal() {
		if(media()<6) return  (2*mediaCorte) - media();

		return 0.0;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getNotaTrabalho() {
		return notaTrabalho;
	}

	public void setNotaTrabalho(Double notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
	
}
