package aula11;
import java.util.Scanner;

//Exercicio - receber valores de duas variáveis int e double, e apresentar conversões em string na tela
public class Aula11Exercicio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int v1 = entrada.nextInt();
		double v2 = entrada.nextDouble();
		
		String v1c = String.valueOf(v1);
		String v2c = String.valueOf(v2);
		
		System.out.println(v1c + "\n" + v2c);
		
		entrada.close();
	}
}
