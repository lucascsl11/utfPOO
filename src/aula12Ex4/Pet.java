package aula12Ex4;

public class Pet {
	private String nomePet, sexo;
	private int idade;
	private Dono dono;
	private Tratamento tratamento;
	
	public Pet(String nomePet, String sexo, int idade,
			String cpf, String nome, String telefone, String email,
			String logradouro, int numero, String bairro, String cidade, String estado,
			String descricao, String dataIni) {
		this.nomePet = nomePet;
		this.sexo = sexo;
		this.idade = idade;
		
		tratamento = new Tratamento(descricao, dataIni);
		dono = new Dono(cpf, nome, telefone, email, logradouro, numero, bairro, cidade, estado);
	}

	public String getNomePet() {
		return nomePet;
	}

	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Dono getDono() {
		return dono;
	}

	public void setDono(Dono dono) {
		this.dono = dono;
	}

	public Tratamento getTratamento() {
		return tratamento;
	}

	public void setTratamento(Tratamento tratamento) {
		this.tratamento = tratamento;
	}
	
}
