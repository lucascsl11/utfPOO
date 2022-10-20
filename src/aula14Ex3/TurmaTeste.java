package aula14Ex3;

public class TurmaTeste {
	public static void main(String[] args) {
		Turma t = new Turma("A");
		
		t.adicionarAluno(1, "Arnaldo Cesar Coelho", 10.0, 10.0, 4.0, 4.0);
		t.adicionarAluno(2, "Bonifacio", 8.0, 9.0, 4.0, 4.0);
		t.adicionarAluno(3, "Cesar Coelho", 8.0, 3.0, 4.0, 4.0);
		t.adicionarAluno(4, "Deuteronomio da Silva", 10.0, 8.0, 4.0, 4.0);
		t.adicionarAluno(5, "Elementar da Silva Watson", 8.0, 0.0, 4.0, 4.0);
		
		t.calcularMediaAluno("Arnaldo Cesar Coelho");
		t.calcularMediaAluno("Bonifacio");
		t.calcularMediaAluno("Cesar Coelho");
		t.calcularMediaAluno("Deuteronomio da Silva");
		t.calcularMediaAluno("Elementar da Silva Watson");
		t.calcularMediaTurma();
	}
}