package aula14Ex4;
import java.util.List;
import java.util.ArrayList;

public class Estacionamento {
	private List<Vaga> vagas;
	
	public Estacionamento() {
		this.vagas = new ArrayList<Vaga>();
	}
	
	public void pavimentarVagas(int numero) {
		Vaga vaga = new Vaga(numero);
		vagas.add(vaga);
	}
	
	public void alocarCarroVaga(String placaCarro, Integer horaEstacionamento, Integer numeroVaga) {
		for(Vaga vaga : vagas) {
			if(vaga.getNumero().equals(numeroVaga)) {
				vaga.estacionarVeiculo(placaCarro, horaEstacionamento);
			}
		}
	}
	
	public void tirarVeiculoVaga(String placaCarro, Integer horaRetirada, Integer numeroVaga) {
		for(Vaga vaga : vagas) {
			if(vaga.getNumero().equals(numeroVaga)) {
				vaga.retirarVeiculo(placaCarro, horaRetirada);
			}
		}
	}
	
}
