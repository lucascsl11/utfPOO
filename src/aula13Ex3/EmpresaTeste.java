package aula13Ex3;

public class EmpresaTeste {
	public static void main(String[] args) {
		Empresa e1 = new Empresa("AAAAAAAAAAAAAAA", "razao");
		
		e1.setUf(UnidadeFederativa.PARANA);
		e1.imprimirEmpresa();
	}
}
