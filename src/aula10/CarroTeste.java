package aula10;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		System.out.println(c1.getVelocidade());
		System.out.println(c1.getMarcha());
		
		c1.acelerar();
		System.out.println(c1.getVelocidade());
		System.out.println(c1.getMarcha());
		
		c1.frear();
		System.out.println(c1.getVelocidade());
		System.out.println(c1.getMarcha());
		
		//Testes funcionando
	}
}
