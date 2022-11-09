package aula15Ex1;

public class Aluno extends Pessoa{
	private Integer matricula;
	
	public Aluno(String nome, String nascimento, long cpf, long rg, Integer matricula) {
		super(nome, nascimento, cpf, rg);
		this.matricula = matricula;
	}

	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", nascimento=" + nascimento + ", cpf=" + cpf
				+ ", rg=" + rg + "]";
	}
}
