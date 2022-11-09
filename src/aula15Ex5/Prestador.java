package aula15Ex5;

public class Prestador extends Colaborador {
	protected Double valorHora;
	protected String tipoServico;
	
	public Prestador(String nome, String endereco, String dataInicio,
			Double valorHora, String tipoServico) {
		super(nome, endereco, dataInicio);
		this.valorHora = valorHora;
		this.tipoServico = tipoServico;
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
	
	public String getTipoServico() {
		return tipoServico;
	}
	
	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}
	
	public Double getValorHora() {
		return valorHora;
	}
	
	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	
	public String toString() {
		return super.toString() + "[tipoServico=" + tipoServico + ", valorHora=" + valorHora + "]";
	}
}
