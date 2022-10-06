package aula13Ex1;

public class Cliente {
	private int codigo;
	private String nome, dataNascimento;
	private EstadoCivil estadoCivil;
	
	public Cliente(int codigo, String nome, String dataNascimento) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		
		//Assumindo por padrão que todo cliente é solteiro
		estadoCivil = EstadoCivil.SOLTEIRO;
	}
	
	public void imprimirCliente() {
		System.out.println("CODIGO: " + codigo 
				+ "\nNOME: " + nome
				+ "\nDATA DE NASCIMENTO: " + dataNascimento
				+ "\nESTADO CIVIL: " + estadoCivil);
	}
	
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
}
