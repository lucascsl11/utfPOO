package aula12;

public class Edicao {
	private int numero, volume;
	private String data;
	
	private Artigo [] artigos;
	
	public int getNumero() {
		return numero;
	}
	public int getVolume() {
		return volume;
	}
	public String getData() {
		return data;
	}
	public Artigo[] getArtigos() {
		return artigos;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void setArtigos(Artigo[] artigos) {
		this.artigos = artigos;
	}
}
