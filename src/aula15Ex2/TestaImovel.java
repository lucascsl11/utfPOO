package aula15Ex2;

public class TestaImovel {
	public static void main(String[] args) {
		ImovelVelho iv1 = new ImovelVelho("Rua R", 20000.00);
		ImovelNovo in1 = new ImovelNovo("Rua R1", 20000.00);
		
		System.out.println(iv1);
		System.out.println(in1);
	}
}
