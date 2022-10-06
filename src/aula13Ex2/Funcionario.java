package aula13Ex2;

public class Funcionario {
	private int cod;
	private String nome;
	private DiaSemana diaFolga;
	
	public Funcionario(int cod, String nome) {
		this.cod = cod;
		this.nome = nome;
	}
	
	public void setDiaFolga(DiaSemana diaFolga) {
		this.diaFolga = diaFolga;
	}
	
	public void imprimirFuncionario() {
		System.out.println("Codigo do funcionario: " + cod);
		System.out.println("Nome do funcionario: " + nome);
		System.out.println("Dia de folga: " + diaFolga.getDia());
	}
}
