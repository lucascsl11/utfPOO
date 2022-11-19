package aula17Ex3;

public class PessoaJuridica extends Pessoa {
	private Integer numeroFuncionarios;
	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}
	@Override
	public final void calcularImpostoPago() {
		if(this.numeroFuncionarios > 15) {
			System.out.println("Imposto pago por " + this.nome + ": " + (this.rendaAnual * 0.13));
			return;
		}
		System.out.println("Imposto pago por " + this.nome + ": " + (this.rendaAnual * 0.18));
	}
}
