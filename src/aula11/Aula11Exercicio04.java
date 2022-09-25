package aula11;
import java.util.Scanner;

//Exercicio - receber um angulo de entrada e calcular seno, cosseno e tangente
public class Aula11Exercicio04 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		double graus = ent.nextDouble();
		double rad = Math.toRadians(graus);
		System.out.println("Seno do angulo: " + Math.sin(rad));
		System.out.println("Cosseno do angulo: " + Math.cos(rad));
		System.out.println("Tangente do angulo: " + Math.tan(rad));
		
		ent.close();
	}
}
