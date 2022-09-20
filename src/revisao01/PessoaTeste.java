package revisao01;
import java.util.Scanner; //Biblioteca necessária para utilizar entrada de dados

public class PessoaTeste {
	public static void main(String[] args) {
		//Variável scanner para entrada de dados
		Scanner entradaTeclado = new Scanner(System.in);
		
		//Instanciando objetos
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		//Saída e entrada de dados
		System.out.println("=== PROGRAMA DE REVISAO - POO ===");
		
		System.out.println("=== PESSOA 1 ===");
		System.out.printf("Informe seu nome: ");
		p1.nome = entradaTeclado.nextLine();
		while(p1.nome == "") {
			System.out.printf("Por favor insira um nome valido: ");
			p1.nome = entradaTeclado.nextLine();
		}
		
		System.out.printf("Informe seu CPF: ");
		p1.cpf = entradaTeclado.nextLine();
		while(p1.cpf == "") {
			System.out.printf("Por favor insira um CPF valido: ");
			p1.cpf = entradaTeclado.nextLine();
		}
		
		System.out.printf("Informe sua idade: ");
		p1.idade = entradaTeclado.nextInt();
		while(p1.idade <= 0) {
			System.out.printf("Idade invalida. Informe novamente: ");
			p1.idade = entradaTeclado.nextInt();
		}
		
		//Sempre informar números double com vírgula no input, mas no código colocar ponto
		System.out.printf("Informe seu peso: ");
		p1.peso = entradaTeclado.nextDouble();
		while(p1.peso <= 0) {
			System.out.printf("Idade invalida. Informe novamente: ");
			p1.peso = entradaTeclado.nextDouble();
		}
		p1.mostrarDados();
		
		entradaTeclado.nextLine();
		
		System.out.println("=== PESSOA 2 ===");
		System.out.printf("Informe seu nome: ");
		p2.nome = entradaTeclado.nextLine();
		while(p2.nome == "") {
			System.out.printf("Por favor insira um nome valido: ");
			p2.nome = entradaTeclado.nextLine();
		}
		
		System.out.printf("Informe seu CPF: ");
		p2.cpf = entradaTeclado.nextLine();
		while(p2.cpf == "") {
			System.out.printf("Por favor insira um CPF valido: ");
			p2.cpf = entradaTeclado.nextLine();
		}
		
		System.out.printf("Informe sua idade: ");
		p2.idade = entradaTeclado.nextInt();
		while(p2.idade <= 0) {
			System.out.printf("Idade invalida. Informe novamente: ");
			p2.idade = entradaTeclado.nextInt();
		}
		
		//Sempre informar números double com vírgula no input, mas no código colocar ponto
		System.out.printf("Informe seu peso: ");
		p2.peso = entradaTeclado.nextDouble();
		while(p2.peso <= 0) {
			System.out.printf("Idade invalida. Informe novamente: ");
			p2.peso = entradaTeclado.nextDouble();
		}
		p2.mostrarDados();
		
		//Fechar o scanner - boas práticas - professor pode acabar cobrando?
		entradaTeclado.close();
	}
}