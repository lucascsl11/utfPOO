package aula17Ex3;

public class PessoaFisica extends Pessoa{
	private Double gastoComSaude;
	public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}
	
	@Override
	public final void calcularImpostoPago() {
		Double imposto;
		if(this.rendaAnual < 20000.00) {
			imposto = 0.15 * rendaAnual;
		}
		else {
			imposto = 0.2 * rendaAnual;
		}
		if(gastoComSaude > 0.00) {
			imposto -= (gastoComSaude / 2);
		}
		System.out.println("Imposto pago por " + this.nome + ": " + imposto);
	}
}
