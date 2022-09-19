package aula10Exercicio03;

public class Funcionario {
	private int registro;
	private String nome, dataNascimento, setor, telefone, endereco;
	private char sexo;
	
	//Construtor
	public Funcionario(int registro, String nome, String dataNascimento, String setor, String telefone, char sexo, String rua, int numeroRua, String bairro, String cidade, String estado) {
		this.registro = registro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.setor = setor;
		this.telefone = telefone;
		this.sexo = sexo;
		
		this.endereco = (rua + ", " + numeroRua + " - " + bairro + ", " + cidade + " - " + estado);
	}
	
	//Getters
	public int getRegistro() {
		return registro;
	}
	public String getNome() {
		return nome;
	}
	public char getSexo() {
		return sexo;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getSetor() {
		return setor;
	}
	public String getEndereco() {
		return endereco;
	}
	
	//Setters
	public void setRegistro(int registro) {
		if(registro <= 0) {
			System.out.println("Registro invalido");
			return;
		}
		this.registro = registro;
	}
	public void setNome(String nome) {
		if(nome.equals("")) {
			System.out.println("Nome invalido");
			return;
		}
		this.nome = nome;
	}
	public void setSetor(String setor) {
		if(setor.equals("")) {
			System.out.println("Setor invalido... ou o funcionario esta sendo demitido?");
			return;
		}
		this.setor = setor;
	}
	public void setSexo(char sexo) {
		//Masculino, feminino ou outro
		if(sexo != 'M' && sexo != 'F' && sexo != 'O') {
			System.out.println("Sexo invalido");
			return;
		}
		this.sexo = sexo;
	}
	public void setTelefone(String telefone) {
		if(telefone.equals("")) {
			System.out.println("Sexo invalido");
			return;
		}
		this.telefone = telefone;
	}
	public void setEndereco(String endereco) {
		//O usuário aqui informaria um novo endereço completo ao invés de apenas os dados
		if(endereco.equals("")) {
			System.out.println("Endereco invalido");
			return;
		}
		this.endereco = endereco;
	}
	
	
	//Impressão
	public void exibirRelatorio() {
		System.out.println(
				"=========== FUNCIONARIO ===========\n"
				+ "\nNUMERO DE REGISTRO: " + registro
				+ "\nNOME COMPLETO: " + nome
				+ "\nSEXO: " + sexo
				+ "\nDATA DE NASCIMENTO: " + dataNascimento
				+ "\nTELEFONE: " + telefone
				+ "\nSETOR: " + setor
				+ "\nENDERECO: " + endereco + "\n"
			);
	}
}
