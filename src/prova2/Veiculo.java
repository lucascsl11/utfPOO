package prova2;

public class Veiculo {
	private String modelo, marca, placa, nomeCliente;
	private int diaLocacao;
	private double valorDiaria;
	private boolean disponivel;
	
	//Construtor
	public Veiculo(String marca, String modelo, String placa, double valorDiaria) {
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.valorDiaria = valorDiaria;
		
		this.diaLocacao = 0;
		this.nomeCliente = "";
		this.disponivel = true;
	}
	
	//Setters
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	//Getters
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public double getValorDiaria() {
		return valorDiaria;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public int getDiaLocacao() {
		return diaLocacao;
	}

	
	public void alugar(String nomeCliente, int diaLocacao) {
		if(disponivel) {
			//Validação
			if(diaLocacao > 0) {
				//Mais camadas de validação
				if(!nomeCliente.equals("") && !nomeCliente.equals(" ")) {
					this.nomeCliente = nomeCliente;
					this.diaLocacao = diaLocacao;
					disponivel = false;
					
					System.out.println("====== LOCACAO ======");
					System.out.println(marca
							+ " " + modelo + " " + placa + " alugado com sucesso por "
							+ nomeCliente + " no dia " + diaLocacao);
				}
				else {
					System.out.println("O cliente deve ter um nome!");
				}
			}
			else {
				System.out.println("Dia de locacao invalida!");
			}
		}
		else {
			System.out.println(marca
					+ " " + modelo + " " + placa + " ja foi alugado por "
					+ this.nomeCliente + " no dia " + this.diaLocacao);
		}
	}

	public void devolver(int diaDevolucao) {
		if(!disponivel) {
			//Validação
			if(diaDevolucao > 0) {
				//Mais validação
				if(diaDevolucao >= diaLocacao) {
					System.out.println("====== DEVOLUCAO ======");
					System.out.println("Veiculo " + marca
							+ " " + modelo + " " + placa + " devolvido com sucesso.");
					System.out.println("Valor da Diaria: " + valorDiaria
							+ "\n" + "Nome do Cliente: " + nomeCliente
							+ "\n" + "Dia da Locacao: " + diaLocacao
							+ "\n" + "Dia da Devolucao: " + diaDevolucao
							+ "\n" + "Valor total: " + calcularValor(diaLocacao, diaDevolucao));
					disponivel = true;
				}
				else {
					System.out.println("Dia da devolucao n�o pode ser anterior ao dia de locacao!");
				}
			}
			else {
				System.out.println("Dia de devolucao invalido!");
			}
		}
		else {
			System.out.println(marca
					+ " " + modelo + " " + placa + " ja esta na locadora");
		}
	}
	
	private double calcularValor(int diaLocacao, int diaDevolucao) {
		double valorTotal = (diaDevolucao - diaLocacao) * valorDiaria;
		return valorTotal;
	}

	public String toString() {
		String disp;
		if(disponivel)
			disp = "Sim";
		else
			disp = "Nao";
		return "\n========= VEICULO =========" 
				+ "\nModelo: " + modelo 
				+ "\nMarca: " + marca
				+ "\nPlaca: " + placa 
				+ "\nValor da Diaria: " + valorDiaria 
				+ "\nDisponivel: " + disp;
	}
}
