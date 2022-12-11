package aula19;

//A classe agora implementa o método de uma interface
public class Sedex10 implements Frete {

	@Override
	public double calcularFrete(Integer distancia) {
		return (distancia * 0.48) + 16;
	}

}
