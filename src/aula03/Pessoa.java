package aula03;

public class Pessoa {
	String nome, dialogo;
	int idade;
	double peso;
	
	public void andar() {
		System.out.println(nome + " está andando.");
	}
	public void correr() {
		System.out.println(nome + " está correndo.");
	}
	public void falar() {
		System.out.println(nome + " está falando: " + dialogo);
	}
	@Override
	//Boa prática porque é uma classe criada
	public String toString() {
		return "Pessoa [nome=" + nome + ", dialogo=" + dialogo + ", idade=" + idade + ", peso=" + peso + "]";
	}
}
