package aula19;

public class Pac implements Frete {

	@Override
	public double calcularFrete(Integer distancia) {
		return (distancia * 0.3) + 10;
	}

}
