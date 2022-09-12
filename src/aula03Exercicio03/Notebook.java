package aula03Exercicio03;

public class Notebook {
	String marca, modelo, modeloProcessador;
	int memRAM, memHD;
	double polegadasTela;
	final int QUANTIDADE_ESTOQUE = 20;
	
	public void ligar() {
		System.out.println(marca + " " + modelo + " está ligando!");
	}
	public void desligar() {
		System.out.println(marca + " " + modelo + " está desligando.");
	}
	public void processarInformacoes() {
		System.out.println(marca + " " + modelo + " está processando informações!");
	}
	public void conectarAInternet() {
		System.out.println(marca + " " + modelo + " está se conectando à internet.");
	}
}
