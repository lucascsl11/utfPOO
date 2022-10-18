package aula14Ex1;

public class BancoTeste {
	public static void main(String[] args) {
		Banco banco = new Banco(1, "a");
		
		banco.adicionarNovaConta(1, "Joao");
		banco.verificarSaldoConta(1);
		banco.realizarDepositoConta(1, 3.00);
	}
}
