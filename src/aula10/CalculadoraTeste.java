package aula10;

public class CalculadoraTeste {
	public static void main(String[] args) {
		Calculadora c1 = new Calculadora("CASIO", "FX", "Cientifica", 12);
		
		System.out.println(c1.getMarca() + " " + c1.getModelo() + " - Calculadora " + c1.getTipo() + " - " + c1.getMemoria() + "MB de memoria");
		
		c1.somar(3, 40);
		c1.subtrair(1230, 123);
		c1.multiplicar(1.3, 41.20);
		c1.dividir(10, 4);
	}
}
