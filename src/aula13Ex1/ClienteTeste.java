package aula13Ex1;

public class ClienteTeste {
	public static void main(String[] args) {
		Cliente c1 = new Cliente(1, "A", "10/01/2001");
		
		c1.imprimirCliente();
		c1.setEstadoCivil(EstadoCivil.CASADO);
		c1.imprimirCliente();
	}
}
