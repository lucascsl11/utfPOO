package aula17Ex3;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new PessoaFisica("Gerson", 20000.00, 0.00);
		Pessoa p2 = new PessoaJuridica("Netflix", 10000.00, 14);
		
		p1.calcularImpostoPago();
		p2.calcularImpostoPago();
	}
}
