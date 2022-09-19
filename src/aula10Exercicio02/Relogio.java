package aula10Exercicio02;

public class Relogio {
	//A marca do relógio não pode ser alterada
	private String marca;
	private int hora, minutos;
	
	//Método construtor
	public Relogio(String marca, int hora, int minutos) {
		this.marca = marca;
		this.hora = hora;
		this.minutos = minutos;
	}
	
	//Impressor
	public void imprimirTempo() {
		System.out.printf("Horario atual do %s = %02d:%02d\n", marca, hora, minutos);
	}
	
	//Setters
	public void setHora(int hora) {
		if(hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
		else {
			System.out.println("Hora invalida");
		}
	}
	public void setMinutos(int minutos) {
		if(minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
		}
		else {
			System.out.println("Minutos invalidos");
		}
	}

	public String getMarca() {
		return marca;
	}
	public int getHora() {
		return hora;
	}
	public int getMinutos() {
		return minutos;
	}
}
