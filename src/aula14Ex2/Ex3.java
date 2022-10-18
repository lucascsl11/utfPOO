package aula14Ex2;
import java.util.List;
import java.util.ArrayList;

public class Ex3 {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		long inicio = System.currentTimeMillis();
		
		//Inserir 500 mil números no arrayList, percorrer e imprimir tudo
		for(Integer i = 0; i < 500000; i++) {
			lista.add(i);
		}
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		
		System.out.println("\n\nTempo gasto: " + tempo + "ms");
	}
}
