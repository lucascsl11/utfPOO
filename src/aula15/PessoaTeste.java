package aula15;

public class PessoaTeste {
	public static void main(String[] args) {
		Professor p1 = new Professor("Vinicius", 30, 1010010.00, "Rua R", "Bairro B", "Cidade C", "PR", 1);
		Aluno a1 = new Aluno("Lucas", 21, "BCC", "Rua R1", "Bairro B1", "Cidade C1", "PR", 1);
		
		a1.realizarMatricula();
		System.out.println(a1);
		p1.calcularSalario();
		System.out.println(p1);
	}	
}
