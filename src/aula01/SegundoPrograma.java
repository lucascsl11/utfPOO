package aula01;

public class SegundoPrograma {
	public static void main(String[] args) {
		String produto1 = "Notebook", produto2 = "SSD";
		double precoProduto1 = 3500.00, precoProduto2 = 250.00;
		
		System.out.println("Produtos:");
		System.out.printf("%s por apenas R$%.2f\n", produto1, precoProduto1);
		System.out.printf("%s por apenas R$%.2f", produto2, precoProduto2);
	}
}
