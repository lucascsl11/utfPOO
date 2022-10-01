package aula12;

public class Pessoa {
	private String nome, dataNascimento, sexo, email;
	private Endereco endereco;
	
	//JEITO 1
	/*
	public Pessoa(String nome, String dataNascimento, String sexo, String email, Endereco endereco) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.endereco = endereco;
	}
	*/
	
	//JEITO 2
	public Pessoa(String nome, String dataNascimento, String sexo, String email, String logradouro, String bairro, String cidade, String unidadeFederativa, int numero) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		
		//Instanciação de um objeto endereço dentro do objeto pessoa --- mais efetivo!
		this.endereco = new Endereco(logradouro, bairro, cidade, unidadeFederativa, numero);
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public String getNome() {
		return nome;
	}
	public String getSexo() {
		return sexo;
	}

	@Override
	public String toString() {
		return "Nome: " + nome 
				+ "\nDataNascimento: " + dataNascimento 
				+ "\nSexo: " + sexo 
				+ "\nEmail: " + email
				+ "\n\nENDERECO" + "\nLogradouro: " + endereco.getLogradouro() //DÁ PRA USAR GETTERS NO OBJETO AO INVES DE IMPRIMIR endereco
				+ "\nBairro: " + endereco.getBairro()
				+ "\nCidade: " + endereco.getCidade()
				+ "\nUF: " + endereco.getUnidadeFederativa()
				+ "\nNumero: " + endereco.getNumero();
	}
}
