package aula11;
import java.util.Scanner;

/*
 * Entrada de dados string 
 * 
 * Programa deve:
 * 	- retornar o caractere da posição 3
 * 	- retornar o número total de caracteres
 * 	- imprimir a string colocada em letras minúsculas
 *  - dividi-la em várias substrings, critério de divisão sendo " " (espaço)
 *  	- ou seja, dividir por palavra
 *  - solicitar uma segunda string
 *  	- comparar a segunda string com a primeira, exibindo mensagem se forem iguais
*/
public class Aula11Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Primeira string: ");
		String str = entrada.nextLine();
		
		System.out.println("Caracter da posicao 3: " + str.charAt(3));
		System.out.println("Total de caracteres da string: " + str.length());
		System.out.println("Minuscula: " + str.toLowerCase());
		
		//Divisão por espaço e colocação dos resultados em um array
		String [] strDividida = str.split(" ");
		
		System.out.println("==== STRING DIVIDIDA ====");
		for(int i = 0; i < strDividida.length; i++) {
			System.out.println(strDividida[i]);
		}
		
		System.out.println("");
		
		System.out.printf("Segunda string: ");
		String str2 = entrada.nextLine();
		
		if(str.equals(str2)) {
			System.out.println("Sao iguais");
		}
		else System.out.println("Nao sao iguais");
		
		entrada.close();
	}	
}
