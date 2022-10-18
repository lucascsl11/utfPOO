package aula14Ex1;

public class Conta {
	private Integer numeroConta;
	private double saldo;
	private String nomeTitular;
	
	public Conta(Integer numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		
		this.saldo = 0.00;
	}
	
	public void verificarSaldo() {
		System.out.println("Conta: " + this.numeroConta + "\nSaldo: R$" + this.saldo + "\n");
	}
	public void realizarSaque(Double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}
	public void realizarDeposito(double valor) {
		this.saldo += valor;
		System.out.println("Valor de R$" + valor + " depositado");
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public Double getSaldo() {
		return saldo;
	}
}
