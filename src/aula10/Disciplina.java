package aula10;

public class Disciplina {
	/*
	 * disciplina é constituída de:
	 * - código
	 * - nome
	 * - modalidade (presencial / ead)
	 * - carga horária (horas)
	 * - conteúdo programático
	*/
	private int codigo, horas;
	private String nome, modalidade, conteudo;
	
	//Construtor
	public Disciplina(int codigo, int horas, String nome, String modalidade, String conteudo) {
		this.codigo = codigo;
		this.horas = horas;
		this.nome = nome;
		this.modalidade = modalidade;
		this.conteudo = conteudo;
	}
	
	//Getters
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public int getHoras() {
		return horas;
	}
	public String getModalidade() {
		return modalidade;
	}
	public String getConteudo() {
		return conteudo;
	}
	
	//Setters
	public void setCodigo(int codigo) {
		if(codigo <= 0) {
			System.out.println("Codigo invalido - valor 0 ou negativo");
			return;
		}
		else
			this.codigo = codigo;
	}
	public void setConteudo(String conteudo) {
		if(conteudo.equals("")) {
			System.out.println("A disciplina deve ter algum conteudo!");
			return;
		}
		this.conteudo = conteudo;
	}
	public void setHoras(int horas) {
		if(horas <= 0) {
			System.out.println("Quantidade invalida de horas");
			return;
		}
		this.horas = horas;
	}
	public void setModalidade(String modalidade) {
		if(!modalidade.equals("EAD") && (!modalidade.equals("Presencial"))) {
			System.out.println("Modalidade nao incluida.");
			return;
		}
		this.modalidade = modalidade;
	}
	public void setNome(String nome) {
		if(nome.equals("")) {
			System.out.println("A materia deve ter nome!");
			return;
		}
		this.nome = nome;
	}
	
	public void exibirRelatorio() {
		System.out.println(
				"\n========== RELATORIO DA DISCIPLINA ==========\n"
				+ "Codigo: " + codigo + "\n"
				+ "Nome: " + nome + "\n"
				+ "Carga Horaria: " + horas + " horas\n"
				+ "Modalidade: " + modalidade + "\n"
				+ "Conteudo Programatico: " + conteudo + "\n"
			);
	}
}
