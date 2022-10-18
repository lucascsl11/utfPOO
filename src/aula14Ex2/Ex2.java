package aula14Ex2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ex2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<Integer> lista = new ArrayList<Integer>();
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Numero " + i + ": ");
			int num = entrada.nextInt();
			lista.add(num);
		}
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		entrada.close();
	}
}
