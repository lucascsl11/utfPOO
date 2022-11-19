package aula17Ex2;

public class ImovelNovo extends Imovel {
	private Double valorAdicional;
	
	public ImovelNovo(String endereco, Double valorBase, Double valorAdicional) {
		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
	}
	
	public Double getValorAdicional() {
		return valorAdicional;
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Valor adicional: " + this.getValorAdicional());
		System.out.println("Valor final: " + (super.valorBase + this.getValorAdicional()));
	}
}
