package aula01;

public class PrimeiroPrograma {
	public static void main(String[] args){ //declarando a main
		//println ---> ln = "line"
		
		int idade = 30;
		String nome = "Cleiton";
		boolean cu = true;
		
		//Tipos de print
			//Print normal --> não quebra linha
			System.out.print("eae vei");
			System.out.print("tudo bem?");
			
			//Println --> quebra linha
			System.out.println("\ncoxinha");
			System.out.println(nome + " tem " + idade + " anos. Tem cu? " + cu);
			
			//Printf ---> funciona que nem na linguagem C
			System.out.printf("%s tem %d anos", nome, idade);
	}
}