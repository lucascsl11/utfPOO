package aula15Ex3;

public class IngressoTeste {
	public static void main(String[] args) {
		IngressoNormal in1 = new IngressoNormal("Normal", 10.00);
		CamaroteSuperior cs1 = new CamaroteSuperior("VIP", 10.00, "Camarote Superior?", 40.00);
		CamaroteInferior ci1 = new CamaroteInferior("VIP", 10.00, "Camarote Inferior", 20.00);
		
		System.out.println(in1);
		System.out.println(cs1);
		System.out.println(ci1);
	}
}
