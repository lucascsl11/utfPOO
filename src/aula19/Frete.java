package aula19;

/*
 * Uma interface é um tipo que define um conjunto de métodos que uma classe deve implementar. 
 * Estabelece um "contrato" que a classe deve cumprir.
 * Possibilita a criação de sistemas com BAIXO ACOPLAMENTO (acoplamento sendo uma grande
 * dependência entre classes) e com FLEXIBILIDADE.
 * 
 * Exemplo: interface Frete de um carrinho de compra, onde se pode usar vários serviços de 
 * entrega diferentes ao invés de utilizar uma classe diferente pra cada serviço
 * 
 * na interface são definidos métodos abstratos pra implementar nas classes de frete
*/

public interface Frete {
	//Todos os métodos da interface são sempre ABSTRATOS E PÚBLICOS
	public abstract double calcularFrete(Integer distancia);
}
