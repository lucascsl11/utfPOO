package revisao01;
import java.util.Scanner; //Biblioteca necessária para utilizar entrada de dados

public class RevisaoTeste {
	public static void main(String[] args) {
		//Variável scanner para entrada de dados
		Scanner entradaTeclado = new Scanner(System.in);
		//Saída e entrada de dados
		System.out.println("Programa de revisao para prova de POO");
		System.out.printf("Informe seu nome: ");
		String nome = entradaTeclado.nextLine();
		System.out.printf("Informe sua idade: ");
		int idade = entradaTeclado.nextInt();
		//Loops
		while(idade <= 0) {
			System.out.printf("Idade invalida. Informe novamente: ");
			idade = entradaTeclado.nextInt();
		}
		//Operadores ternários -- condicionais para variáveis
		String frase = (idade > 60) ? "Idoso" : "Gente normal"; 
		System.out.println(frase);
		//Sempre informar números double com vírgula no input, mas no código colocar ponto
		System.out.printf("Informe seu peso: ");
		double peso = entradaTeclado.nextDouble();
		
		//Saída de dados formatada
		System.out.printf("Seu nome e %s e sua idade e de %d anos, pesa %.1fkg", nome, idade, peso);
		
		//Fechar o scanner - boas práticas - professor pode acabar cobrando?
		entradaTeclado.close();
	}
}
