package aula15Ex3;

public class IngressoVip extends Ingresso {
	private String localizacao;
	private Double valorAdicional;

	public IngressoVip(String tipo, Double valor, String localizacao, Double valorAdicional) {
		super(tipo, valor);
		this.localizacao = localizacao;
		this.valorAdicional = valorAdicional;
	}
	
	private Double calcularValorIngressoVip() {
		return valor + valorAdicional;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nlocalizacao vip: " + this.localizacao
				+ "valor vip: " + this.calcularValorIngressoVip();
	}
}