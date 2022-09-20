package aula09;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c1 = new Carro("Bugatti", "Veyron", "Vermelho", 2001, 3120930, 12093, "ABC-1234");
		
		System.out.println(c1);
		
		c1.ligar();
		System.out.println(c1.velocidade);
		c1.acelerar(1230);
		System.out.println(c1.velocidade);
		c1.frear(230);
		System.out.println(c1.velocidade);
	}
}
