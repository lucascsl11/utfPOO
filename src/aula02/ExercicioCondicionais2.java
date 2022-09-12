package aula02;
import java.util.Scanner;

public class ExercicioCondicionais2 {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		double valorCompra = entradaTeclado.nextDouble();
		
		double desconto = (valorCompra >= 50.00) ? (0.1 * valorCompra) : (0.05 * valorCompra);
		System.out.println("O valor de desconto para " + valorCompra + " e " + desconto);
		
		entradaTeclado.close();
	}
}