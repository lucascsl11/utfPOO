package aula15Ex2;

public class ImovelVelho extends Imovel {
	public ImovelVelho(String endereco, Double valorBase) {
		super(endereco, (valorBase - 10000.00));
	}
	public String toString() {
		return "ImovelVelho [endereco=" + endereco + ", valorBase=" + valorBase + "]";
	}
}
