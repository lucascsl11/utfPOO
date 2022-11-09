package aula15Ex2;

public class ImovelNovo extends Imovel {
	public ImovelNovo(String endereco, Double valorBase) {
		super(endereco, (valorBase + 10000.00));
	}
	public String toString() {
		return "ImovelNovo [endereco=" + endereco + ", valorBase=" + valorBase + "]";
	}
}
