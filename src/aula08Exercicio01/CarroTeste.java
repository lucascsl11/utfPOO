package aula08Exercicio01;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c1 = new Carro("FERRARI", "FERRO ARI", "vermelho", "ABC-1010", 2022);
		System.out.println(c1);
		
		Carro c2 = new Carro("FERRARI", "FERRO", 2022);
		System.out.println(c2);
		
		Carro c3 = new Carro();
		System.out.println(c3);
	}
}
