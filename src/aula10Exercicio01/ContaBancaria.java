package aula10Exercicio01;

public class ContaBancaria {
	//Encapsulamento - esconder a estrutura de um objeto atrás de operações sobre ele
	//sendo acessível apenas por meio dessas operações
	
	//Atributos privados, que podem apenas ser acessíveis por operações - encapsulamento!
	//A partir de agora, TODOS os atributos devem ser encapsulados
	private int numero;
	private String titular;
	private double saldo;
	
	//Método construtor
	public ContaBancaria(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
		
		//Inicia-se uma conta com saldo inicial de 0 reais
		this.saldo = 0.00;
	}
	
	/*
	 * Métodos getter 
	 * obtém o valor de uma variável privada do objeto
	 * já que ela não pode ser acessada em outras classes
	*/
	public int getNumero() {
		return numero;
	}
	
	public String getTitular() {
		return titular;
	}
	
	/*
	 * Métodos setter
	 * atribui valor a uma variável privada do objeto 
	*/
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	//Métodos públicos - acessíveis em outras classes
	//Método publico - pode ser usado no pacote inteiro e por outras classes
	public void sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque executado com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			System.out.println("Deposito executado com sucesso");
			this.calcularRendimento();
		}
		else {
			System.out.println("Nao se pode depositar um valor menor ou igual a zero!");
		}	
	}
	
	public void imprimirSaldo() {
		System.out.println("======== SALDO ========");
		System.out.println(numero);
		System.out.println(titular);
		System.out.printf("%.2f", saldo);
	}
	
	//Método privado do objeto, acessível somente NA PRÓPRIA CLASSE
	private void calcularRendimento() {
		this.saldo *= 1.10;
	}	
}
