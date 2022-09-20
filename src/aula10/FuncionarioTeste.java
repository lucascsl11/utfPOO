package aula10;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(1, "Joao da Silva", "11/06/2001", "Informatica", "(01) 2345-6789", 'M', "Rua Alguma Coisa", 420, "Algum Bairro", "Alguma Cidade", "RJ");
		
		f1.exibirRelatorio();
		
		f1.setNome("Maria das Cruzes");
		f1.setSexo('F');
		f1.setRegistro(2);
		f1.setSetor("Admin");
		f1.exibirRelatorio();
	}
}
