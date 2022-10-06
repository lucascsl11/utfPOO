package aula13Ex3;

public enum UnidadeFederativa {
	RIO_GRANDE_DO_SUL ("Rio Grande do Sul", "RS", "Porto Alegre"),
	SANTA_CATARINA ("Santa Catarina", "SC", "Florianópolis"),
	PARANA ("Paraná", "PR", "Curitiba"),
	SAO_PAULO ("São Paulo", "SP", "São Paulo"),
	RIO_DE_JANEIRO ("Rio de Janeiro", "RJ", "Rio de Janeiro"),
	MINAS_GERAIS ("Minas Gerais", "MG", "Belo Horizonte"),
	ESPIRITO_SANTO ("Espirito Santo", "ES", "Vitoria");

	private String nomeUF, sigla, capital;
	private UnidadeFederativa(String nomeUF, String sigla, String capital) {
		this.nomeUF = nomeUF;
		this.sigla = sigla;
		this.capital = capital;
	}
	
	public String getCapital() {
		return capital;
	}
	public String getNomeUF() {
		return nomeUF;
	}
	public String getSigla() {
		return sigla;
	}
}
