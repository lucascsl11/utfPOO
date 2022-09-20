package revisao01;

public class Pessoa {
	//Atributos do objeto
	String nome, cpf;
	int idade;
	double peso;
	
	public void mostrarDados() {
		//Operadores ternários -- condicionais para variáveis
		String frase = (idade > 60) ? "Individuo " + nome + " e idoso" : "Individuo " + nome + " e gente normal"; 
		//Saída de dados
		System.out.println("Nome: " 
				+ nome + "\nCPF: " 
				+ cpf + "\nIdade: " 
				+ idade + "\nPeso: " 
				+ peso + "kg.\n" + frase);
	}
}
