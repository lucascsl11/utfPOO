package aula15Ex5;

public class Autonomo extends Prestador {
	private long cpf;
	
	public Autonomo(String nome, String endereco, String dataInicio,
			Double valorHora, String tipoServico, long cpf) {
		super(nome, endereco, dataInicio, valorHora, tipoServico);
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}
	
	public void setCpf(long cpf) {
		this.cpf = cpf;
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
		return super.getTipoServico();
	}
	
	public void setTipoServico(String tipoServico) {
		super.setTipoServico(tipoServico);
	}
	
	public Double getValorHora() {
		return super.getValorHora();
	}
	
	public void setValorHora(Double valorHora) {
		super.setValorHora(valorHora);
	}
	
	@Override
	public String toString() {
		return super.toString() + "[cpf=" + cpf + "]";
	}
	
}
