package aula17Ex2;

public class ImovelTeste {
	public static void main(String[] args) {
		Imovel i = null;
		String opcao = "Usado";
		
		if(opcao == "Novo") {
			i = new ImovelNovo("Rua A", 100.00, 10.00);
		}
		else {
			i = new ImovelUsado("Rua A", 100.00, 10.00);
		}
		i.imprimirDados();
	}
}
