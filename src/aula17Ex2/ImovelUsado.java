package aula17Ex2;

public class ImovelUsado extends Imovel {
	private Double valorDesconto;
	
	public ImovelUsado(String endereco, Double valorBase, Double valorDesconto) {
		super(endereco, valorBase);
		this.valorDesconto = valorDesconto;
	}
	
	public Double getValorDesconto() {
		return valorDesconto;
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Valor de desconto: " + this.getValorDesconto());
		System.out.println("Valor total: " + (super.valorBase - this.getValorDesconto()));
	}
	
}
