package aula14Ex3;
import java.util.List;
import java.util.ArrayList;

public class Turma {
	private String nome;
	List<Aluno> alunos;
	
	public Turma(String nome) {
		this.nome = nome;
		this.alunos = new ArrayList<Aluno>();
	}
	
	public void adicionarAluno(Integer ra, String nome, Double n1, Double n2, Double n3, Double n4) {
		if(alunos.size() < 5) {
			Aluno aluno = new Aluno(ra, nome, n1, n2, n3, n4);
			alunos.add(aluno);
		}
		else {
			System.out.println("Turma cheia");
		}
	}
	
	public void calcularMediaAluno(String nome) {
		for(Aluno aluno : alunos) {
			if(aluno.getNome().equals(nome)) {
				aluno.calcularExibirMedia(nome);
				break;
			}
		}
	}
	
	public void calcularMediaTurma() {
		Double soma = 0.0;
		for(Aluno aluno : alunos) {
			soma += aluno.getMedia();
		}
		System.out.println("Media da turma: " + (soma / 5.0));
	}
	
	public String getNome() {
		return nome;
	}
}
