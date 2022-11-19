package aula17Ex1;

public class Retangulo extends Quadrilatero {
	private Double base, altura;
	
	public Retangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public void calcularArea() {
		System.out.println(base * altura);
	}
}
