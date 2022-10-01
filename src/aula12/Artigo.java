package aula12;

public class Artigo {
	private String tituloArtigo;
	
	public String getTituloArtigo() {
		return tituloArtigo;
	}
	
	public void setTituloArtigo(String tituloArtigo) {
		this.tituloArtigo = tituloArtigo;
	}
	
	public Artigo(String tituloArtigo) {
		this.tituloArtigo = tituloArtigo;
	}
	
	public String toString() {
		return "Titulo: " + tituloArtigo;
	}
}
