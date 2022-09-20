package aula09;

public class Carro {
	public Carro(String marca, String modelo, String cor, int ano, int renavam, int chassi, String placa) {
		//Atributos com final já são nomeados diferentemente por padrão.
		MARCA = marca;
		MODELO = modelo;
		//Logo, não precisamos colocar this já que o método construtor diferencia automaticamente
		this.cor = cor;
		ANO = ano;
		RENAVAM = renavam;
		CHASSI = chassi;
		PLACA = placa;
		
		//Atributos que não precisam passar por parâmetro no método construtor
		this.velocidade = 0;
		this.ligado = false;
	}

	final String MARCA, MODELO, PLACA;
	String cor;
	final int ANO, RENAVAM, CHASSI;
	int velocidade;
	boolean ligado;

	public void ligar() {
		if(ligado)
			System.out.println(MARCA + " " + MODELO + " já está ligado.");
		else{
			System.out.println(MARCA + " " + MODELO + " ligando");
			ligado = true;
		}
	}
	public void desligar() {
		if(!ligado)
			System.out.println(MARCA + " " + MODELO + " já está desligado.");
		else{
			System.out.println(MARCA + " " + MODELO + " desligando");
			ligado = false;
		}
	}
	public void acelerar(int vel) {
		if(ligado) {
			System.out.println(MARCA + " " + MODELO + " acelerando");
			velocidade += vel;
			System.out.println("Velocidade atual do modelo: " + velocidade + "km/h");
		}
		else
			System.out.println("O carro deve estar ligado para acelerar!");
	}
	public void frear(int vel) {
		if(ligado) {
			System.out.println(MARCA + " " + MODELO + " freando");
			velocidade -= vel;
			if(velocidade < 0) {
				velocidade = 0;
				System.out.println(MARCA + " " + MODELO + " parado");
			}
			else
				System.out.println("Velocidade atual do modelo: " + velocidade + "km/h");
		}
		else
			System.out.println("O carro deve estar ligado para frear!");
	}
	@Override
	public String toString() {
		return "MARCA: " + MARCA + "\nMODELO: " + MODELO + "\nPLACA: " + PLACA
				+ "\nCOR: " + cor + "\nANO: " + ANO + "\nRENAVAM: " + RENAVAM
				+ "\nCHASSI: " + CHASSI + "\nVELOCIDADE: " + velocidade	+ "\n";
	}
}
