package aula13;

public class Pedido {
	private int id;
	private String data;
	private Status status;
	
	public Pedido(int id, String data) {
		this.id = id;
		this.data = data;
		
		//Atribuindo uma das constantes de status ao status do pedido
		status = Status.AGUARDANDO_PAGAMENTO;
	}
	
	public void imprimirPedido() {
		System.out.println("CODIGO: " + this.id
				+ "\nDATA: " + this.data
				+ "\nSTATUS: " + this.status);
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
}
