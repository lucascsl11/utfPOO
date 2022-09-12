package aula09Exercicio01;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Lucas", "11/06/2001", 
				"(22) 9-9724-9228", "costasouzalucas11@gmail.com", 
				"Solteiro", "058.310.927-63");
		
		Pessoa p2 = new Pessoa("Joao", "11/06/2002", 
				"(22) 9-9724-9328", "UGAYVIAEON@gmail.com", 
				"Solteiro", "058.311.927-63");
		
		Pessoa p3 = new Pessoa("Luiza", "11/06/2009", 
				"(22) 9-9724-9258", "okammo@gmail.com", 
				"Solteira", "058.310.921-63");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}