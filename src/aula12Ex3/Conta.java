package aula12Ex3;

public class Conta {
	private int codigo;
	private double saldo;
	private Titular titular;
	
	public Conta(int codigo, double saldo, 
			String cpf, String rg, String nome, String dataNascimento, String sexo, double rendaMensal,
			String bairro, String cidade, String estado, String logradouro, int numero) {
		this.codigo = codigo;
		this.saldo = saldo;
		titular = new Titular(cpf, rg, nome, dataNascimento, sexo, rendaMensal, bairro, cidade, estado, logradouro, numero);
	}
	
	//Colocar validação depois
	public void sacar(double valor) {
		if(saldo < valor) {
			System.out.println("Saldo insuficiente");
			return;
		}
		saldo -= valor;
	}
	public void depositar(double valor) {
		saldo += valor;
	}
	
	//Isso aqui que é o toString
	public void emitirSaldo() {
		System.out.println("==== CONTA ====\n"
				+ "CODIGO: " + codigo
				+ "\nSALDO: " + saldo
				+ "\nNOME DO TITULAR: " + titular.getNome()
				+ "\nRG DO TITULAR: " + titular.getRg()
				+ "\nCPF DO TITULAR: " + titular.getCpf()
				+ "\nNASC DO TITULAR: " + titular.getDataNascimento()
				+ "\nSEXO DO TITULAR: " + titular.getSexo()
				+ "\nRENDA MENSAL DO TITULAR: " + titular.getRendaMensal()
				+ "\nENDERECO DO TITULAR: " + titular.getEndereco().getLogradouro()
				+ ", " + titular.getEndereco().getNumero()
				+ " - " + titular.getEndereco().getBairro()
				+ ", " + titular.getEndereco().getCidade()
				+ " - " + titular.getEndereco().getEstado());
	}
}
