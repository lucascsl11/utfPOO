package aula18;

public class Horista extends Funcionario {
	private Double precoHora, horasTrabalhadas;
	
	public Horista(String nome, Long cpf, Double salarioBase, Double precoHora, Double horasTrabalhadas) {
		super(nome, cpf, salarioBase);
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	@Override
	public Double calcularSalario() {
		return super.getSalarioBase() + (this.precoHora * this.horasTrabalhadas);
	}
	
}
