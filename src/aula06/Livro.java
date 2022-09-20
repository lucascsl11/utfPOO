package aula06;

public class Livro {
	String titulo, autor, editora, disp;
	int numeroPaginas, anoPublicacao;
	boolean situacao = true;
	
	public void emprestar() {
		if(situacao) {
			System.out.println("Livro " + titulo + " emprestado!");
			situacao = false;
		}
		else {
			System.out.println("Livro " + titulo + " indisponivel para emprestimo.");
		}
	}
	
	public void devolver() {
		if(!situacao) {
			System.out.println("Livro " + titulo + " devolvido!");
			situacao = true;
		}
		else {
			System.out.println("Livro " + titulo + " ja foi devolvido.");
		}
	}
	
	public void exibirRelatorio() {
		if(situacao)
			disp = "disponivel para emprestimo";
		else 
			disp = "indisponivel para emprestimo";
		System.out.println(titulo + ", " + autor + ", " + editora + ", " + numeroPaginas + " paginas, " + anoPublicacao + ", " + disp);
	}
}
