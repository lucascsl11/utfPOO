package aula12;

public class Endereco {
	String logradouro, bairro, cidade, unidadeFederativa;
	int numero;
	
	public Endereco(String logradouro, String bairro, String cidade, String unidadeFederativa, int numero) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.unidadeFederativa = unidadeFederativa;
		this.numero = numero;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getUnidadeFederativa() {
		return unidadeFederativa;
	}

	@Override
	public String toString() {
		return "Logradouro: " + logradouro 
				+ "\nBairro: " + bairro 
				+ "\nCidade: " + cidade
				+ "\nUF: " + unidadeFederativa 
				+ "\nNumero: " + numero;
	}
	
}
