package aula15Ex5;

public class Funcionario extends Colaborador{
	protected String funcao;
	protected Double salario;
	
	public Funcionario(String nome, String endereco, String dataInicio,
			String funcao, Double salario) {
		super(nome, endereco, dataInicio);
		this.funcao = funcao;
		this.salario = salario;
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
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return super.toString() + "[funcao=" + funcao + ", salario=" + salario + "]";
	}
}
