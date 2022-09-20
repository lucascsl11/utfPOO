package aula03;

public class Calculadora {
	/* Desenvolva um sistema de calculadora. 
	 * Cada calculadora é identificada por sua marca,
	 * modelo, tipo e memória interna. Além disso, cada 
	 * calculadora pode ligar, desligar, realizar os
	 * cálculos de soma, subtração, multiplicação e divisão. 
	 * Para instanciar e atribuir os valores para
	 * cada calculadora, declare uma classe de teste.*/
	String marca, modelo, tipo;
	int memoriaInterna;
	
	public void ligar() {}
	public void desligar() {}
	public void soma(double a, double b) {
		System.out.println(a + b);
	}
	public void subtracao(double a, double b) {
		System.out.println(a - b);
	}
	public void multiplicacao(double a, double b) {
		System.out.println(a * b);
	}
	public void divisao(double a, double b) {
		System.out.println(a / b);
	}
}
