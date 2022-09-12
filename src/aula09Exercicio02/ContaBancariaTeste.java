package aula09Exercicio02;

public class ContaBancariaTeste {
	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria(123456, "Lucas", "051092-1", 500.00);
		ContaBancaria c2 = new ContaBancaria(567891, "Amanda", "019032-1", 550.00);
		ContaBancaria c3 = new ContaBancaria(012345, "Maria", "012132-1", 450.00);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println("Numero total de contas criadas: " + ContaBancaria.numeroContas);
	}
}
