package aula15Ex5;

public class Empregado extends Funcionario {
	private Integer carteiraTrabalho;
	
	public Empregado(String nome, String endereco, String dataInicio, 
			String funcao, Double salario, Integer carteiraTrabalho) {
		super(nome, endereco, dataInicio, funcao, salario);
		this.carteiraTrabalho = carteiraTrabalho;
	}
	
	public String getNome() {
		return super.getNome();
	}
	
	public void setNome(String nome) {
		super.setNome(nome);
	}
	
	public String getEndereco() {
		return super.getEndereco();
	}
	
	public void setEndereco(String endereco) {
		super.setEndereco(endereco);
	}
	
	public String getDataInicio() {
		return super.getDataInicio();
	}
	
	public void setDataInicio(String dataInicio) {
		super.setDataInicio(dataInicio);
	}
	
	public String getFuncao() {
		return super.getFuncao();
	}
	
	public void setFuncao(String funcao) {
		super.setFuncao(funcao);
	}
	
	public Double getSalario() {
		return super.getSalario();
	}
	
	public void setSalario(Double salario) {
		super.setSalario(salario);
	}

	public Integer getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(Integer carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}
	
	public String toString() {
		return super.toString() + "[carteiraTrabalho=" + carteiraTrabalho + "]";
	}
}
