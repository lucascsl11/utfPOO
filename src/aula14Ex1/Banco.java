package aula14Ex1;
import java.util.List;
import java.util.ArrayList;

public class Banco {
	private List<Conta> contas;
	private Integer cnpj;
	private String nomeBanco;
	
	public Banco(Integer cnpj, String nomeBanco) {
		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;
		
		//Criando lista no construtor
		this.contas = new ArrayList<Conta>();
	}
	
	public void adicionarNovaConta(Integer numeroConta, String nomeTitular) {
		//Criando uma conta e adicionando ela pelo método de Lista
		Conta conta = new Conta(numeroConta, nomeTitular);
		this.contas.add(conta);
	}
	
	public void verificarSaldoConta(Integer numeroConta) {
		//Checando dentro da lista
		for(Conta conta : contas) {
			if(conta.getNumeroConta() == numeroConta) {
				conta.verificarSaldo();
				break;
			}
		}
	}
	
	public void realizarSaqueConta(Integer numeroConta, Double valor) {
		for(Conta conta : contas) {
			if(conta.getNumeroConta().equals(numeroConta)) {
				conta.realizarSaque(valor);
				break;
			}
		}
	}
	
	public void realizarDepositoConta(Integer numeroConta, Double valor) {
		for(Conta conta : contas) {
			if(conta.getNumeroConta().equals(numeroConta)) {
				conta.realizarDeposito(valor);
				break;
			}
		}
	}
	
	public Integer getCnpj() {
		return cnpj;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
}
