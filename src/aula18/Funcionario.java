package aula18;

public abstract class Funcionario {
	protected String nome;
	protected Long cpf;
	protected Double salarioBase;
	
	public Funcionario(String nome, Long cpf, Double salarioBase) {
		this.nome = nome;
		this.cpf = cpf;
		this.salarioBase = salarioBase;
	}
	
	public Double getSalarioBase() {
		return salarioBase;
	}
	
	//Métodos abstratos que não podem ser generalizados
	public abstract Double calcularSalario();
}
