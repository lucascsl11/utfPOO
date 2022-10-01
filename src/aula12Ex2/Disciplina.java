package aula12Ex2;

public class Disciplina {
	private int codigo, cargaHoraria;
	private String nome, modalidade;
	private Professor professor;
	
	public Disciplina(int codigo, int cargaHoraria, String nome, String modalidade, int registro, String nomeProf, String dataNascimento, double salario) {
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
		this.nome = nome;
		this.modalidade = modalidade;
		
		professor = new Professor(registro, nomeProf, dataNascimento, salario);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	
	@Override
	public String toString() {
		return "DISCIPLINA" + "\nCODIGO: " + codigo
				+ "\nNOME: " + nome + "\nCARGA HORARIA: " + cargaHoraria
				+ "\nMODALIDADE: " + modalidade
				+ "\nNOME DO PROFESSOR: " + professor.getNome()
				+ "\nREGISTRO DO PROFESSOR: " + professor.getRegistro()
				+ "\nNASC. DO PROFESSOR: " + professor.getDataNascimento()
				+ "\nSALARIO DO PROFESSOR: " + professor.getSalario();
	}
}
