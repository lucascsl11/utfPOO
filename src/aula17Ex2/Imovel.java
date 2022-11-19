package aula17Ex2;

public class Imovel {
	protected String endereco;
	protected Double valorBase;
	
	public Imovel(String endereco, Double valorBase) {
		this.endereco = endereco;
		this.valorBase = valorBase;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public Double getValorBase() {
		return valorBase;
	}
	
	public void imprimirDados() {
		System.out.println("Endereco: " + this.getEndereco());
		System.out.println("Valor base: " + this.getValorBase());
	}
}
