package aula09;

public class ContaBancaria {
	public ContaBancaria(int numero, String titular, String agencia, double saldo) {
		super();
		NUMERO = numero;
		this.titular = titular;
		this.agencia = agencia;
		this.saldo = saldo;
		
		numeroContas++;
	}
	final int NUMERO; //Atributos imutáveis
	String titular, agencia;
	double saldo;
	
	static int numeroContas = 0; 
	/*
	 * Variável static, de classe = global para todas as instâncias
	 * Ser static não significa ser constante. Só significa que é o mesmo endereço de memória.
	 */
	

	@Override
	public String toString() {
		return "Numero: " + NUMERO + "\nTitular: " + titular + "\nAgencia: " 
				+ agencia + "\nSaldo: " + saldo + "\n";
	}
}
