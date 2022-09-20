package aula06;

public class LivroTeste {
	public static void main(String[] args) {
		Livro livro1 = new Livro();
		
		livro1.titulo = "A Guerra dos Tronos";
		livro1.autor = "George R.R. Martin";
		livro1.editora = "Suma";
		livro1.numeroPaginas = 600;
		livro1.anoPublicacao = 1996;
		
		livro1.emprestar();
		livro1.devolver();
		livro1.devolver();
		
		livro1.exibirRelatorio();
	}
}
