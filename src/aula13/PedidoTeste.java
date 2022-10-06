package aula13;

public class PedidoTeste {
	public static void main(String[] args) {
		Pedido p1 = new Pedido(1, "06/10/2022");
		//Modificando uma variável com enum e setter
		p1.imprimirPedido();
		System.out.println("=====================");
		p1.setStatus(Status.PROCESSANDO);
		p1.imprimirPedido();
		System.out.println("=====================");
		p1.setStatus(Status.ENVIADO);
		p1.imprimirPedido();
		System.out.println("=====================");
		p1.setStatus(Status.ENTREGUE);
		p1.imprimirPedido();
	}
}
