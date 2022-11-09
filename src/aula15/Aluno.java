package aula15;

public class Aluno extends Pessoa {
	private String curso;
	public Aluno(String nome, Integer idade, String curso, String logradouro, String bairro, String cidade, String unidadeFederativa, Integer numero) {
		super(nome, idade, logradouro, bairro, cidade, unidadeFederativa, numero);
		this.curso = curso;
	}
	
	public void realizarMatricula() {
		System.out.println("Aluno " + this.nome + " matriculado no curso " + this.curso);
	}

	public String toString() {
		return "Aluno [curso=" + curso + ", nome=" + nome + ", idade=" + idade 
				+ ", endereco=" + endereco.getLogradouro() + ", " + endereco.getBairro() + ", " + endereco.getCidade() 
				+ ", " + endereco.getUnidadeFederativa() + ", " + endereco.getNumero() + "]";
	}
}
