package aula12Ex1;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Funcionario fA = new Funcionario(1, "A", "11/06/2022", "M", "Informatica", "(22) 99999-9999",
				"Rua A", 123, "Bairro B", "Cidade C", "Estado E");
		
		fA.emitirRelatorio();
	}
}
