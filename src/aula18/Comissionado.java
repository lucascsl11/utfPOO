package aula18;

public class Comissionado extends Funcionario {
	private Double totalVendas, taxaComissao;
	
	public Comissionado(String nome, Long cpf, Double salarioBase, Double totalVendas, Double taxaComissao) {
		super(nome, cpf, salarioBase);
		this.totalVendas = totalVendas;
		this.taxaComissao = taxaComissao;
	}
	
	@Override
	public Double calcularSalario() {
		return super.getSalarioBase() + (this.totalVendas * this.taxaComissao);
	}

}
