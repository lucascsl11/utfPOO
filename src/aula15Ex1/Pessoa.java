package aula15Ex1;

public class Pessoa {
	protected String nome, nascimento;
	protected long cpf, rg;
	
	public Pessoa(String nome, String nascimento, long cpf, long rg) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.rg = rg;
	}

	public String toString() {
		return "Pessoa [nome=" + nome + ", nascimento=" + nascimento + ", cpf=" + cpf + ", rg=" + rg + "]";
	}	
}
