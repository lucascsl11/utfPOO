package aula14;
//Importações necessárias para manipular listas
import java.util.ArrayList;
import java.util.List;

public class ArrayListTeste {
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("V1", 10);
		Pessoa p1 = new Pessoa("Arnaldo", 1);
		
		List lista = new ArrayList();
		
		//Objetos da classe ArrayList recebem qualquer tipo de elemento, primitivo ou objeto, podendo ter tipos diferentes misturados
		lista.add('A');
		lista.add(3);
		lista.add(10.2);
		lista.add(v1);
		lista.add(p1);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//Como a função get() retorna objetos genéricos, devemos usar casting (o eclipse até indica isso)
		String nome = (String) lista.get(0);
		Integer num = (Integer) lista.get(1);
		
		//===========================================================//
		
		//Podemos usar Generics pra restringir listas a um determinado tipo ou objeto
		List<String> listaNomes = new ArrayList<String>();
		
		listaNomes.add("Joao");
		listaNomes.add("Maria");
		//Isso aqui não funcionaria devido a restrição de string
		//   listaNomes.add(1);
		
		//Não precisamos de casting porque a lista já foi restrita ao tipo String
		String nome1 = listaNomes.get(0);
	}
}
