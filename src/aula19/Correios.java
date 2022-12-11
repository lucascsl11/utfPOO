package aula19;

public class Correios implements Frete {

	@Override
	public double calcularFrete(Integer distancia) {
		return (distancia * 0.35) + 13;
	}

}
