package aula18;

public class Assalariado extends Funcionario {
	private Double adicional;
	
	public Assalariado(String nome, Long cpf, Double salarioBase, Double adicional) {
		super(nome, cpf, salarioBase);
		this.adicional = adicional;
	}
	
	@Override
	public Double calcularSalario() {
		return super.getSalarioBase() + this.adicional;
	}
}
