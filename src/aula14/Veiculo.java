package aula14;

public class Veiculo {
	private String modelo;
	private int velocidade;
	public Veiculo(String modelo, int velocidade) {
		this.modelo = modelo;
		this.velocidade = velocidade;
	}
	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", velocidade=" + velocidade + "]";
	}
}
