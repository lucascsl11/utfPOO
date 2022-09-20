package aula10;

public class DisciplinaTeste {
	public static void main(String[] args) {
		Disciplina d1 = new Disciplina(1, 60, "Programacao Orientada a Objetos", "Presencial", "Programacao do jeito legal");
		
		//testes com setter
		d1.exibirRelatorio();
		d1.setConteudo("Java");
		d1.exibirRelatorio();
	}
}
