package aula06Exercicio05;

public class Televisao {
	String marca, resolucao;
	double polegadas;
	int canal = 0, volume = 0, canalLimite = 20, volumeLimite = 100;
	boolean ligado = false;
	
	public void ligar() {
		if(!ligado) {
			System.out.println("TV " + marca + " ligando");
			ligado = true;
		}
		else
			System.out.println("TV " + marca + " ja ligada");
	}
	public void desligar() {
		if(ligado) {
			System.out.println("TV " + marca + " desligando");
			ligado = false;
		}
		else
			System.out.println("TV " + marca + " ja desligada");
	}
	public void alterarCanalPraCima() {
		System.out.println("Alterando para o proximo canal");
		if(canal < canalLimite)
			canal++;
		else
			canal = 0;
		System.out.println("Canal atual: " + canal);
	}
	public void alterarCanalPraBaixo() {
		System.out.println("Alterando para o canal anterior");
		if(canal > 0)
			canal--;
		else
			canal = canalLimite;
		System.out.println("Canal atual: " + canal);
	}
	public void aumentarVolume() {
		System.out.println("Aumentando o volume da TV " + marca);
		if(volume < volumeLimite)
			volume++;
		else
			System.out.println("Volume maximo da TV " + marca + " atingido!");
		
		System.out.println("Volume: " + volume);
	}
	public void diminuirVolume() {
		System.out.println("Diminuindo o volume da TV " + marca);
		volume--;
		if(volume < 0)
		{
			volume = 0;
			System.out.println("TV " + marca + " silenciada");
		}
		System.out.println("Volume: " + volume);
	}
	
	public void exibirRelatorio() {
		System.out.println("TV " + marca + " - Polegadas: " + polegadas + " - Resolucao: " + resolucao);
		System.out.println("Canal atual: " + canal + " - Volume: " + volume);
	}
}
