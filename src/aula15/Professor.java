package aula15;

public class Professor extends Pessoa {
	private Double salario;
	public Professor(String nome, Integer idade, Double salario, String logradouro, String bairro, String cidade, String unidadeFederativa, Integer numero) {
		super(nome, idade, logradouro, bairro, cidade, unidadeFederativa, numero);
		this.salario = salario;
	}
	
	public void calcularSalario() {
		System.out.println("Salario do professor " + this.nome + ": R$" + salario);
	}

	public String toString() {
		return "Professor [salario=" + salario + ", nome=" + nome + ", idade=" + idade + ", endereco="
				+ endereco.getLogradouro() + ", " + endereco.getBairro() + ", " + endereco.getCidade() 
				+ ", " + endereco.getUnidadeFederativa() + ", " + endereco.getNumero() + "]";
	}
}
