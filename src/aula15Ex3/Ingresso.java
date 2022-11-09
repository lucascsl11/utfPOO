package aula15Ex3;

public class Ingresso {
	protected String tipo;
	protected Double valor;
	
	public Ingresso(String tipo, Double valor) {
		this.tipo = tipo;
		this.valor = valor;
	}

	public String toString() {
		return "Ingresso [tipo=" + tipo + ", valor=" + valor + "]";
	}
	
	
}
