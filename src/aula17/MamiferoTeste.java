package aula17;
import java.util.Scanner;

public class MamiferoTeste {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		String opcao = i.nextLine();
		Mamifero mamifero = null;
		
		switch(opcao) {
			case "Gato":
				mamifero = new Gato();
				break;
			case "Cachorro":
				mamifero = new Cachorro();
				break;
			case "Cavalo":
				mamifero = new Cavalo();
				break;
			default:
				System.out.println("nao existe esse animal nao maluco");
		}
		mamifero.emitirSom();
		i.close();
	}
}
