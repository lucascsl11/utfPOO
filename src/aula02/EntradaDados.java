package aula02;
import java.util.Scanner; //Importação do pacote que inclui o tipo de dado scanner, para entrada de dados

public class EntradaDados {
	public static void main(String[] args) {
		//Declaramos aqui um objeto da classe Scanner para entrada de dados
		Scanner entradaTeclado = new Scanner(System.in); 
		
		//Tipos de entrada de dados --> string (nextLine), int (nextInt), double (nextDouble)
		
		//Utilizando o Scanner para atribuir uma entrada de dados a uma variável
		System.out.println("Informe sua idade: ");
		int idade = entradaTeclado.nextInt();
		
		entradaTeclado.nextLine(); //Limpeza de buffer --> por causa do bug na classe Scanner
		//Isso pula a linha propriamente caso uma entrada de string fique dps de int, já que não pula normalmente
		
		System.out.println("Informe seu nome: ");
		String nome = entradaTeclado.nextLine();
		
		System.out.println("Informe seu peso: ");
		double peso = entradaTeclado.nextDouble();
		
		//Digitação de valores decimais via código usa . e no console usa ,
			// peso = 55.5
			// "Digite seu peso: 55,5"
		
		System.out.println(nome + " tem " + idade + " anos e " + peso + "kg.");
		
		//é boa prática fechar a variável scanner após o uso - a IDE avisa caso não feche
		entradaTeclado.close();
		//ainda assim, a variável já se fecha ao fim do procedimento automaticamente
	}
}
