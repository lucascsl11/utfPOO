package aula14Ex2;

public class BibliotecaTeste {
	public static void main(String[] args) {
		Biblioteca b = new Biblioteca();
		b.adicionarLivro("Gerso", "Machine Learning", "ED", 2000, 1);
		b.adicionarLivro("Arnaldo Cesar Coelho", "Futebol", "FIFA", 1920, 3);
		
		b.verificarDisponibilidadeLivro("Machine Learning");
		b.verificarDisponibilidadeLivro("Futebol");
		
		b.emprestarLivro("Machine Learning", 1);
		b.verificarDisponibilidadeLivro("Machine Learning");
		b.devolverLivro("Machine Learning", 5);
		b.devolverLivro("Machine Learning", 1);
	}
}
