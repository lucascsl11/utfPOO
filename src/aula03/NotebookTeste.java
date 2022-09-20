package aula03;

public class NotebookTeste {
	public static void main(String[] args) {
		Notebook n1 = new Notebook();
		
		n1.marca = "Samsung"; n1.memHD = 1000;
		n1.memRAM = 4; n1.modelo = "NP300E5K";
		n1.modeloProcessador = "Intel Core i5";
		n1.polegadasTela = 14.0;
		
		n1.ligar();
		n1.desligar();
		n1.processarInformacoes();
		n1.conectarAInternet();
	}
}
