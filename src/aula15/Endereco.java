package aula15;

public class Endereco {
	private String logradouro, bairro, cidade, unidadeFederativa;
	private Integer numero;
	
	public Endereco(String logradouro, String bairro, String cidade, String unidadeFederativa, Integer numero) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.unidadeFederativa = unidadeFederativa;
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUnidadeFederativa() {
		return unidadeFederativa;
	}

	public void setUnidadeFederativa(String unidadeFederativa) {
		this.unidadeFederativa = unidadeFederativa;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
}
