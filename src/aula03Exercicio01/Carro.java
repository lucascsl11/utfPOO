package aula03Exercicio01;

public class Carro {
	//Atributos
	String modelo, marca, cor, placa, chassi;
	int ano, renavam, velocidade = 0;
	boolean ligado = false;
	
	//Métodos
	public void ligar() {
		if(ligado)
			System.out.println(marca + " " + modelo + " já está ligado.");
		else{
			System.out.println(marca + " " + modelo + " ligando");
			ligado = true;
		}
	}
	public void desligar() {
		if(!ligado)
			System.out.println(marca + " " + modelo + " já está desligado.");
		else{
			System.out.println(marca + " " + modelo + " desligando");
			ligado = false;
		}
	}
	public void acelerar(int vel) {
		if(ligado) {
			System.out.println(marca + " " + modelo + " acelerando");
			velocidade += vel;
			System.out.println("Velocidade atual do modelo: " + velocidade + "km/h");
		}
		else
			System.out.println("O carro deve estar ligado para acelerar!");
	}
	public void frear(int vel) {
		if(ligado) {
			System.out.println(marca + " " + modelo + " freando");
			velocidade -= vel;
			if(velocidade < 0) {
				velocidade = 0;
				System.out.println(marca + " " + modelo + " parado");
			}
			else
				System.out.println("Velocidade atual do modelo: " + velocidade + "km/h");
		}
		else
			System.out.println("O carro deve estar ligado para frear!");
	}
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", placa=" + placa + ", chassi="
				+ chassi + ", ano=" + ano + ", renavam=" + renavam + ", ligado=" + ligado + "]";
	}
	
	/*
	 * Método construtor --- como a toString, ele é feito por padrão, mas podemos customizá-lo.
	 * Declarar manualmente pode permitir que o objeto receba dados em sua instanciação.
	 * 
	 * Isso aqui era o que eu tava tentando fazer antes na prova!
	 * 
	 * Exemplo: new Carro(nome = "ababababab", ano = 2020)
	 * 
	*/
	public Carro(String modelo, String marca, String cor, String placa
			, String chassi, int ano, int renavam) {
		//ponteiro de autoreferencia this para mostrar que isso é um atributo de instancia agora
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.chassi = chassi;
		this.renavam = renavam;
		//atributos fixos não precisam de autoreferencia
		ligado = false;
		velocidade = 0;
	}
}
