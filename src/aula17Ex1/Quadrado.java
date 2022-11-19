package aula17Ex1;

public class Quadrado extends Quadrilatero {
	private Double lado;
	
	public Quadrado(Double lado) {
		this.lado = lado;
	}
	
	@Override
	public void calcularArea() {
		System.out.println(lado * lado);
	}
}
