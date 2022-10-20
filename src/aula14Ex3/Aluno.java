package aula14Ex3;

public class Aluno {
	Integer ra;
	String nome;
	Double[] notas = {0.0, 0.0, 0.0, 0.0};
	
	public Aluno(Integer ra, String nome, Double n1, Double n2, Double n3, Double n4) {
		this.ra = ra;
		this.nome = nome;
		
		//Preenchendo o array das notas
		this.notas[0] = n1;
		this.notas[1] = n2;
		this.notas[2] = n3;
		this.notas[3] = n4;
	}
	
	//O método deverá imprimir o resultado do cálculo seguido da situação do aluno.
	//Baseado em nome para identificar na chamada individual
	public void calcularExibirMedia(String nome) {
		Double media = 0.0;
		for(Double nota : notas) {
			media += nota;
		}
		media /= 4;
		
		System.out.println("Media do aluno " + nome + ": " + media);
		if(media >= 6.0) {
			System.out.println("Aluno aprovado");
		}
		else {
			System.out.println("Aluno reprovado");
		}
	}
	
	public String getNome() {
		return nome;
	}
	public Double getMedia() {
		Double media = 0.0;
		for(Double nota : notas) {
			media += nota;
		}
		return (media /= 4);
	}
}
