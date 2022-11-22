package aula18Ex1;

public class Circulo extends Forma {
	private Double raio;
	
	public Circulo(String cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	@Override
	public Double calcularArea() {
		return (this.raio * this.raio) * 3.14;
	}
	
	@Override
	public Double calcularPerimetro() {
		return (this.raio) * 2 * 3.14;
	}

}
