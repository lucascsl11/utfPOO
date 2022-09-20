package aula03;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c1 = new Carro("model 1", "ferrari", "vermelho", "ABCP1-231"
				, "20", 2000, 90);
		
		//Substituindo inicialização de atributos em método construtor
		
		
		System.out.println(c1);
		
		c1.ligar();
		c1.acelerar(10);
		c1.frear(20);
	}
}
