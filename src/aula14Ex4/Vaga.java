package aula14Ex4;

public class Vaga {
	private Veiculo veiculo;
	private Integer numero, horaEstacionamento;
	private boolean ocupada;
	
	
	public Vaga(Integer numero) {
		this.numero = numero;
		this.ocupada = false;
		//Não acho que vá precisar colocar um veículo quando criar a vaga né
	}
	
	public void estacionarVeiculo(String placa, int horaEstacionamento) {
		if(this.ocupada) {
			System.out.println("Esta vaga ja foi ocupada pelo carro de placa " + this.veiculo.getPlaca() + " desde a hora " + this.horaEstacionamento);
		}
		else {
			this.veiculo = new Veiculo(placa);
			this.horaEstacionamento = horaEstacionamento;
			this.ocupada = true;
			System.out.println("Carro " + placa + " estacionado na hora " + horaEstacionamento);
		}
	}
	
	public void retirarVeiculo(String placa, int horaRetirada) {
		if(!this.ocupada) {
			System.out.println("Esta vaga ja esta vazia");
		}
		else {
			Integer horas = (horaRetirada - this.horaEstacionamento);
			Double tarifa = 2.00;
			if(horas > 3) {
				tarifa += ((horas-3) * 0.5);
			}
			this.ocupada = false;
			System.out.println("Carro " + placa + " retirado da vaga na hora " + horaRetirada);
			System.out.println("Tarifa total: " + tarifa);
		}
	}
	
	public Integer getNumero() {
		return numero;
	}
}
