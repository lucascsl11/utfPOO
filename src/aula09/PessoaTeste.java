package aula09;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Lucas", "11/06/2001", 
				"(99) 9-9999-9999", "email@email.com", 
				"Solteiro", "123.456.789-01");
		
		Pessoa p2 = new Pessoa("Joao", "11/06/2002", 
				"(22) 9-8888-8888", "UGAYVIAEON@gmail.com", 
				"Solteiro", "456.789.012-34");
		
		Pessoa p3 = new Pessoa("Luiza", "11/06/2009", 
				"(22) 9-7777-7777", "okammo@gmail.com", 
				"Casada", "789.012.345-67");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}