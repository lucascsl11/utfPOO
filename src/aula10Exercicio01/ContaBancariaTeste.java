package aula10Exercicio01;

public class ContaBancariaTeste {
	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria(1, "Joao Carlos");
		c1.depositar(100.00);
		c1.imprimirSaldo();
	}
}
