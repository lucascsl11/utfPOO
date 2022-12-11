package aula19;

public class Sedex implements Frete {

	@Override
	public double calcularFrete(Integer distancia) {
		return (distancia * 0.45) + 15;
	}

}
