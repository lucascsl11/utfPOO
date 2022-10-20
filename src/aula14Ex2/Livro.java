package aula14Ex2;

public class Livro {
	private String autor, titulo, editora;
	private Integer anoPublicacao, numPaginas, diaEmprestimo;
	private boolean disponivel;
	
	public Livro(String autor, String titulo, String editora, 
			Integer anoPublicacao, Integer numPaginas) {
		this.autor = autor;
		this.titulo = titulo;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
		this.numPaginas = numPaginas;
		
		this.disponivel = true;
	}
	
	public void verificarDisponibilidade() {
		if(this.disponivel) {
			System.out.println("O livro " + this.titulo + " esta no acervo");
			return;
		}
		System.out.println("O livro " + this.titulo + " nao esta no acervo");
		return;
	}
	
	public void emprestar(String titulo, Integer diaEmprestimo) {
		if(this.disponivel) {
			System.out.println("Livro " + this.titulo + " emprestado. Dia: " + diaEmprestimo + ".");
			this.disponivel = false;
			this.diaEmprestimo = diaEmprestimo;
			return;
		}
		else {
			System.out.println("O livro " + this.titulo + " indisponivel. Dia Emprestimo: " + this.diaEmprestimo);
			return;
		}
	}
	
	public void devolver(String titulo, Integer diaDevolucao) {
		if(!(this.disponivel)) {
			System.out.println("Livro " + this.titulo + " devolvido. Dia: " + diaDevolucao + ".");
			Integer diasReservado = diaDevolucao - this.diaEmprestimo;
			//Checando se é passível de multa
			if(diasReservado > 7) {
				System.out.println("Sera cobrada uma multa de R$" + (1.50 * (diasReservado-7)) + ".");
			}
			else {
				System.out.println("Nao sera cobrada multa.");
			}
			this.disponivel = true;
			return;
		}
		else {
			System.out.println("O livro " + this.titulo + " devolvido com sucesso");
			return;
		}
	}
	
	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}
	public String getAutor() {
		return autor;
	}
	public String getEditora() {
		return editora;
	}
	public Integer getNumPaginas() {
		return numPaginas;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setAnoPublicacao(Integer anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public void setNumPaginas(Integer numPaginas) {
		this.numPaginas = numPaginas;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
