package aula10;

public class Calculadora {
	private String marca, modelo, tipo;
	private int memoria;
	
	//Construtor
	public Calculadora(String marca, String modelo, String tipo, int memoria) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.memoria = memoria;
	}
	
	//Getters
	public String getMarca() {
		return marca;
	}
	public int getMemoria() {
		return memoria;
	}
	public String getModelo() {
		return modelo;
	}
	public String getTipo() {
		return tipo;
	}
	//sem setters! os atributos não poderão ser alterados
	
	//Métodos
	void somar(double a, double b) {
		System.out.println(a+b);
	}
	void subtrair(double a, double b) {
		System.out.println(a-b);
	}
	void multiplicar(double a, double b) {
		System.out.println(a*b);
	}
	void dividir(double a, double b) {
		System.out.println(a/b);
	}
	
	
	
	
}
