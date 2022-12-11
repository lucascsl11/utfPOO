package aula19;

public class CarrinhoTeste {
	public static void main(String[] args) {
		/*
		 * Utilizando inversão de controle e injeção de dependência
		 * pra instanciar Frete concretamente (uma das classes que a implementam)
		 * 
		 * Inversão de Controle: tirando da classe a responsabilidade de instanciar as dependencias dela
		 * Injeção de dependência: um componente de fora faz a instanciação injetada no objeto
		*/
		
		//Otimização, podemos usar new dentro do construtor
		CarrinhoCompra carrinho1 = new CarrinhoCompra(100.00, 130, new Correios());
		System.out.println("Valor da compra: " + carrinho1.realizarCompra());
		
		CarrinhoCompra carrinho2 = new CarrinhoCompra(100.00, 130, new Sedex());
		System.out.println("compra: " + carrinho2.realizarCompra());
		
	}
}
