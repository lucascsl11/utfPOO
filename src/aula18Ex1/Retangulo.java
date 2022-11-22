package aula18Ex1;

public class Retangulo extends Forma {
	private Double base, altura;
	
	public Retangulo(String cor, Double base, Double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public Double calcularArea() {
		return (base * altura);
	}

	@Override
	public Double calcularPerimetro() {
		return ((base * 2) + (altura * 2));
	}
}
