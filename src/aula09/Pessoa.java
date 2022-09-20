package aula09;

public class Pessoa {
	/*
	 * Método construtor é usado para quando precisamos declarar constantes
	 * diferentes para vários objetos diferentes. Assim podemos criar com parâmetros
	 * diferentes algo que não pode mais ser alterado uma vez atribuído.
	 * 
	 * Sempre começar variáveis por método construtor agora!
	*/
	public Pessoa(String nome, String dataNasc, String telefone, String email, String estadoCivil, String cpf) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.email = email;
		this.estadoCivil = estadoCivil;
		this.CPF = cpf;
	}

	String nome, dataNasc, telefone, email, estadoCivil;
	final String CPF; //Variáveis final -- constantes! Uma vez atribuídas, não podem ser mudadas

	@Override
	public String toString() {
		return "Nome: " + nome + "\nData de Nascimento:" + dataNasc
				+ "\nTelefone: " + telefone + "\nEmail: " + email
				+ "\nEstado Civil: " + estadoCivil + "\nCPF: " + CPF + "\n";
	}
}
