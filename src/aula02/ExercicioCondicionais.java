package aula02;
import java.util.Scanner;

public class ExercicioCondicionais {
	public static void main(String[] args) {
		int x = 10;
		//Operador Ternário, que verifica expressões booleanas para atribuir valor a uma variável
		String frase = (x > 0) ? "Numero x positivo" : "Numero x negativo";
		System.out.println(frase);
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		int n1 = entradaTeclado.nextInt();
		int n2 = entradaTeclado.nextInt();
		int n3 = entradaTeclado.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("Maior numero: " + n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("Maior numero:" + n2);
		}
		else {
			System.out.println("Maior numero: " + n3);
		}
		
		entradaTeclado.close();
	}
}
