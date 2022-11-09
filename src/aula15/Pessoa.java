package aula15;

public class Pessoa {
	protected String nome;
	protected Integer idade;
	protected Endereco endereco;
	
	public Pessoa(String nome, Integer idade, String logradouro, String bairro, String cidade, String unidadeFederativa, Integer numero) {
		this.nome = nome;
		this.idade = idade;
		
		this.endereco = new Endereco(logradouro, bairro, cidade, unidadeFederativa, numero);
	}
}
