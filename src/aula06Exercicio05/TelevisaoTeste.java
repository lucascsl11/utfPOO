package aula06Exercicio05;

public class TelevisaoTeste {
	public static void main(String[] args) {
		Televisao t1 = new Televisao();
		
		t1.marca = "Samsung";
		t1.polegadas = 14.5;
		t1.resolucao = "1280x720";
		
		t1.ligar();
		t1.desligar();
		t1.alterarCanalPraCima();
		t1.alterarCanalPraBaixo();
		t1.aumentarVolume();
		t1.diminuirVolume();
		t1.exibirRelatorio();
	}
}
