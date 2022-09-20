package aula03;
import java.util.Scanner;

public class CalculadoraTeste {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Scanner entrada = new Scanner(System.in);
		
		calc.marca = "Marca de Calculadora";
		calc.memoriaInterna = 4;
		calc.modelo = "Modelo de Calculadora";
		calc.tipo = "Cientifica";
		
		int input = 0;
		double a, b;
		while(input != 5) {
			System.out.println("Calculadora - Escolha Opcao\n");
			System.out.println("Informe primeiro valor:");
			a = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Informe primeiro valor:");
			b = entrada.nextInt();
			entrada.nextLine();
			System.out.println("1 - Soma");
			System.out.println("2 - Subtracao");
			System.out.println("3 - Multiplicacao");
			System.out.println("4 - Divisao");
			input = entrada.nextInt();
			
			if(input == 1)
				calc.soma(a, b);
			else if(input == 2)
				calc.subtracao(a, b);
			else if(input == 3)
				calc.multiplicacao(a, b);
			else
				calc.divisao(a, b);
		}
		entrada.close();
	}
}
