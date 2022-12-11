package aula19;

public class CarrinhoCompra {
	private Double valorCompra;
	private Integer distancia;
	private Frete frete;
	
	public CarrinhoCompra(Double valorCompra, Integer distancia, Frete frete) {
		this.valorCompra = valorCompra;
		this.distancia = distancia;
		this.frete = frete;
	}
	
	public Frete getFrete() {
		return frete;
	}
	
	public Integer getDistancia() {
		return distancia;
	}
	
	public Double getValorCompra() {
		return valorCompra;
	}
	
	public Double realizarCompra() {
		double valorFrete = this.getFrete().calcularFrete(this.getDistancia());
		return this.getValorCompra() + valorFrete;
	}
}
