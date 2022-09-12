package aula08Exercicio01;

public class Carro {
	String modelo, marca, cor, placa;
	int ano, velocidade;
	boolean ligado;
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
	
	/*
	 * Método construtor --- como a toString, ele é feito por padrão, mas podemos customizá-lo.
	 * Declarar manualmente pode permitir que o objeto receba dados em sua instanciação.
	 * 
	 * Isso aqui era o que eu tava tentando fazer antes na prova!
	 * 
	 * Exemplo: new Carro(nome = "ababababab", ano = 2020)
	 * 
	 * MÉTODOS CONSTRUTORES NÃO PODEM TER CONDICIONAIS! NÃO TEM QUE TER LÓGICA AQUI
	 * 
	 * Métodos construtores podem gerados pelo source assim como o toString();
	 * 
	 * Também podem ser multiplicados com diferentes parametros para diferentes
	 * propósitos no código.
	 * 
	*/
	public Carro(String marca, String modelo, String cor, String placa, int ano) {
		//ponteiro de autoreferencia this para mostrar que isso é um atributo de instancia agora
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		
		//atributos fixos não precisam de autoreferencia
		ligado = false;
		velocidade = 0;
	}
	
	public Carro(String marca, String modelo, int ano) {
		//Invocação de um método construtor - no caso o método completo
		this(marca, modelo, "", "", ano);
		
		//A invocação é uma refatoração de this.sla o que redundantes.
		//Economiza linhas.
	}
	
	//Chamada de método construtor novamente, para uma chamada com nada nos parâmetros
	public Carro() {
		this("","","","",0);
	}
	
	
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", placa=" + placa + ", ano=" + ano
				+ ", velocidade=" + velocidade + ", ligado=" + ligado + "]";
	}

}
