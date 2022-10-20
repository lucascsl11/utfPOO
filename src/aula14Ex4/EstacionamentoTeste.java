package aula14Ex4;

public class EstacionamentoTeste {
	public static void main(String[] args) {
		Estacionamento e1 = new Estacionamento();
		
		e1.pavimentarVagas(1);
		e1.alocarCarroVaga("ABC", 2, 1);
		e1.tirarVeiculoVaga("ABC", 10, 1);
	}
}
