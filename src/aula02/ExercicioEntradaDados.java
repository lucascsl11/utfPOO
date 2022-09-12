package aula02;
import java.util.Scanner;

public class ExercicioEntradaDados {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Informe seu nome completo: ");
		String nomeCompleto = entradaTeclado.nextLine();
		
		System.out.println("Informe seu sexo: ");
		String sexo = entradaTeclado.nextLine();
		
		System.out.println("Informe seu estado civil: ");
		String estadoCivil = entradaTeclado.nextLine();
		
		System.out.println("Informe sua quantidade de filhos: ");
		int quantFilhos = entradaTeclado.nextInt();
		
		entradaTeclado.nextLine();
		
		System.out.println("Informe sua escolaridade: ");
		String escolaridade = entradaTeclado.nextLine();
		
		System.out.println("Informe sua renda mensal: ");
		double rendaMensal = entradaTeclado.nextDouble();
		
		System.out.println(nomeCompleto + " (" + sexo + ") " + " esta " + estadoCivil + ", tem " + quantFilhos + ", escolaridade de " + escolaridade + ", e renda mensal de " + rendaMensal + ".");
		entradaTeclado.close();
	}
}
