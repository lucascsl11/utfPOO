package aula17Ex1;
import java.util.Scanner;

public class QuadrilateroTeste {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		String opcao = i.nextLine();
		Quadrilatero quad = null;
		
		switch(opcao) {
			case "Quadrado":
				Double l = i.nextDouble();
				quad = new Quadrado(l);
				break;
			
			case "Retangulo":
				Double b = i.nextDouble();
				Double h = i.nextDouble();
				quad = new Retangulo(b,h);
				break;
				
			case "Losango":
				Double dM = i.nextDouble();
				Double dm = i.nextDouble();
				quad = new Losango(dm, dM);
				break;
		}
		
		quad.calcularArea();
		
		i.close();
	}
}
