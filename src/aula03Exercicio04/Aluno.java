package aula03Exercicio04;

public class Aluno {
	int ra, periodo;
	double coeficiente;
	String nome, curso, turno, situacao;
	
	public void imprimirRelatorio() {
		System.out.println("Nome do Aluno: " + nome);
		System.out.println("RA: " + ra);
		System.out.println("Turno: " + turno);
		System.out.println("Curso: " + curso);
		System.out.println("Periodo: " + periodo);
		System.out.println("Coeficiente de Rendimento: " + coeficiente);
		if(coeficiente >= 0.6) {
			situacao =  "Aprovado";
		}
		else {
			situacao = "Reprovado";
		}
		System.out.println("Situacao:" + situacao);
	}
}
