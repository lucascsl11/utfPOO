package aula14Ex2;
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
	private List<Livro> livros;
	
	public Biblioteca() {
		this.livros = new ArrayList<Livro>();
	}
	
	public void adicionarLivro(String autor, String titulo, String editora, 
			Integer anoPublicacao, Integer numPaginas) {
		//Criando uma conta e adicionando ela pelo método de Lista
		Livro livro = new Livro(autor, titulo, editora, anoPublicacao, numPaginas);
		this.livros.add(livro);
	}
	
	public void verificarDisponibilidadeLivro(String titulo) {
		for(Livro livro : livros) {
			if(livro.getTitulo().equals(titulo)) {
				livro.verificarDisponibilidade();
				break;
			}
		}
	}
	
	public void emprestarLivro(String titulo, Integer dia) {
		for(Livro livro : livros) {
			if(livro.getTitulo().equals(titulo)) {
				livro.emprestar(titulo, dia);
				break;
			}
		}
	}
	
	public void devolverLivro(String titulo, Integer dia) {
		for(Livro livro : livros) {
			if(livro.getTitulo().equals(titulo)) {
				livro.devolver(titulo, dia);
				break;
			}
		}
	}
}
