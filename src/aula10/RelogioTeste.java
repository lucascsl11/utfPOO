package aula10;

public class RelogioTeste {
	public static void main(String[] args) {
		Relogio r1 = new Relogio("Rolex", 9, 21);
		
		//Dizendo a hora completa - testando getters
		System.out.println("Hora do relogio " + r1.getMarca() + " - " + r1.getHora() + ":" + r1.getMinutos());
		
		//Mesma coisa que uma impressão, os getters ainda são úteis mas nesse caso menos práticos?
		r1.imprimirTempo();
		
		//Testando setters
		r1.setHora(1);
		r1.imprimirTempo();
		
		r1.setMinutos(3);
		r1.imprimirTempo();
	}
}
