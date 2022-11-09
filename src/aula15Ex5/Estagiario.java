package aula15Ex5;

public class Estagiario extends Funcionario{
	private Integer ciee;
	
	public Estagiario(String nome, String endereco, String dataInicio,
			String funcao, Double salario, Integer ciee) {
		super(nome, endereco, dataInicio, funcao, salario);
		this.ciee = ciee;
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
	
	public Integer getCiee() {
		return ciee;
	}
	
	public void setCiee(Integer ciee) {
		this.ciee = ciee;
	}
	
	@Override
	public String toString() {
		return super.toString() + "[ciee=" + ciee + "]";
	}
}
