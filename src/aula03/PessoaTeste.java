package aula03;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		
		p1.nome = "Joao";
		p1.idade = 25;
		p1.peso = 68.5;
		p1.dialogo = "EAE VEI";
		
		p2.nome = "Maria";
		p2.idade = 30;
		p2.peso = 55.6;
		p2.dialogo = "BLZ VEI";
		
		p3.nome = "Pedro";
		p3.idade = 32;
		p3.peso = 62.4;
		p3.dialogo = "TRANQUILO VEI";
		
		p1.andar();
		p2.correr();
		p3.falar();
		
		System.out.println(p1);
	}
}	