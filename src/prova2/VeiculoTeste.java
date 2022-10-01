package prova2;

public class VeiculoTeste {
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("Ferrari", "F-1", "ABC-1234", 4000.00);
		
		//Testes
		System.out.println(v1);
		
		//Cenário regular
		v1.alugar("Lucas", 1);
		v1.devolver(10);
		
		//Carro já emprestado
		System.out.println("===========");
		v1.alugar("João", 2);
		v1.alugar("Lucas", 1);
		v1.devolver(1);
		
		//Carro já devolvido
		System.out.println("===========");
		v1.devolver(3);
		v1.devolver(3);
		
		//Sem nome do cliente
		System.out.println("===========");
		v1.alugar("", 2);
		
		//Dia de empréstimo inválido
		System.out.println("===========");
		v1.alugar("Maria", 0);
		
		//Dia de devolução inválido
		System.out.println("===========");
		v1.alugar("Amanda", 2);
		v1.devolver(0);
		
		//Getters
		System.out.println("\n=======================\n");
		System.out.println(v1.getMarca());
		System.out.println(v1.getModelo());
		System.out.println(v1.getPlaca());
		System.out.println(v1.getValorDiaria());
		System.out.println(v1.getNomeCliente());
		System.out.println(v1.getDiaLocacao());
		
		//Setters
		System.out.println("\n=======================\n");
		v1.setPlaca("ZYX-9876");
		System.out.println(v1.getPlaca());
		v1.setValorDiaria(2000.00);
		System.out.println(v1.getValorDiaria());
		
		//Testes após o setter
		v1.devolver(4);
	}
}
