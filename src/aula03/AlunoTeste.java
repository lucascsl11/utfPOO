package aula03;

public class AlunoTeste {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		
		a1.nome = "Lucas Costa";
		a1.ra = 2375052;
		a1.turno = "Integral";
		a1.curso = "BCC";
		a1.periodo = 3;
		a1.coeficiente = 0.6;
		
		a1.imprimirRelatorio();
	}
}
