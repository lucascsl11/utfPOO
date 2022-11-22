package aula18Ex1;

public abstract class Forma {
	protected String cor;
	
	public Forma(String cor) {
		this.cor = cor;
	}
	
	//Método que será usado pelas outras formas
	public abstract Double calcularArea();
	public abstract Double calcularPerimetro();
}
