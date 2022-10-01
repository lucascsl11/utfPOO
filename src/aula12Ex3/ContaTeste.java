package aula12Ex3;

public class ContaTeste {
	public static void main(String[] args) {
		Conta c1 = new Conta(1, 100.00,
				"1", "01", "L", "11/01/2001", "M", 100.00,
				"Bairro B", "Cidade C", "Estado R", "Rua R", 100);
		
		c1.emitirSaldo();
		c1.sacar(100);
		c1.emitirSaldo();
		c1.sacar(1);
	}
}
