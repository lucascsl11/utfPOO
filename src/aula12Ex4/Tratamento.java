package aula12Ex4;

public class Tratamento {
	private String descricao, dataIni, dataFim;
	
	public Tratamento(String descricao, String dataIni, String dataFim) {
		this.descricao = descricao;
		this.dataIni = dataIni;
		this.dataFim = dataFim;
	}
	
	public Tratamento(String descricao, String dataIni) {
		this(descricao, dataIni, "");
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataIni() {
		return dataIni;
	}

	public void setDataIni(String dataIni) {
		this.dataIni = dataIni;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	
}
