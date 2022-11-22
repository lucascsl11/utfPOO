package aula18Ex1;

public class FormaTeste {
	public static void main(String[] args) {
		Forma forma = null;
		String opcao = "Circulo";
		
		switch(opcao) {
			case "Circulo":
				forma = new Circulo("Vermelho", 10.0);
				break;
			case "Quadrado":
				forma = new Quadrado("Azul", 30.0);
				break;
			case "Retangulo":
				forma = new Retangulo("Verde", 1.0, 3.0);
				break;
		}
		System.out.println(forma.calcularArea());
		System.out.println(forma.calcularPerimetro());
	}
}
