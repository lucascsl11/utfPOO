package aula11;
import java.util.Scanner;

//Exercicio - Solicitar 2 numeros e retornar o maior, a raiz do primeiro e a potencia dos dois
public class Aula11Exercicio03 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int v1 = ent.nextInt();
		int v2 = ent.nextInt();
		
		System.out.println("Maior valor entre os dois: " + Math.max(v1, v2));
		System.out.println("Raiz quadrada de " + v1 + ": " + Math.sqrt(v1));
		System.out.println(v1 + "^" + v2 + ": " + Math.pow(v1, v2));
		
		ent.close();
	}
}
