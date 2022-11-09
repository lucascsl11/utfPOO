package aula15Ex5;

public class ColaboradorTeste {
	public static void main(String[] args) {
		Empregado e1 = new Empregado("Ze", "Rua R, Numero 1", "10/10/2010", 
				"Zelador", 1200.00, 0);
		Estagiario e2 = new Estagiario("Joaozinho", "Rua A, Numero 2", "1/1/2021", "Desenvolvedor", 0.00, 1);
		Empresa e3 = new Empresa("Kojima Productions", "Rua Q, Numero 10", "9/9/1999", 100.00, "Desenvolvimento de games", 1010100101);
		Autonomo a = new Autonomo("Helena", "Rua H, Numero 4", "5/5/2020", 250.00, "Artes", 101001010);
		
		System.out.println(e1 + "\n" + e2 + "\n" + e3 + "\n" + a);
	}
}
