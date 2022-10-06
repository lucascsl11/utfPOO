package aula13Ex2;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(1, "A");
		
		f1.setDiaFolga(DiaSemana.QUARTA);
		f1.imprimirFuncionario();
	}
}
