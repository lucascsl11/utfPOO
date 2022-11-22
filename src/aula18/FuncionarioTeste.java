package aula18;

public class FuncionarioTeste {
	public static void main(String[] args) {
		//Com classes abstratas, não podemos instanciar um objeto Funcionário
		String opcao = "Comissionado";
		Funcionario funcionario = null;
		
		switch(opcao) {
			case "Assalariado":
				funcionario = new Assalariado("A", 1234521578910L, 12.00, 25.00);
				break;
			case "Comissionado":
				funcionario = new Comissionado("C", 12378910L, 14.00, 20.00, 40.00);
				break;
			case "Horista":
				funcionario = new Horista("H", 12345678910L, 10.00, 23.00, 49.00);
				break;
		}
		System.out.println("Salario do funcionario: " + funcionario.calcularSalario());

	}
}
