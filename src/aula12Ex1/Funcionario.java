package aula12Ex1;

public class Funcionario {
	private int numeroRegistro;
	private String nome, dataNascimento, sexo, setor, telefone;
	private Endereco endereco;
	
	public Funcionario(int numeroRegistro, String nome, String dataNascimento, String sexo, 
			String setor, String telefone, String logradouro, int numero, String bairro, 
			String cidade, String unidadeFederativa) {
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
		
		endereco = new Endereco(logradouro, numero, bairro, cidade, unidadeFederativa);
	}
	
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public String getNome() {
		return nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public String getSetor() {
		return setor;
	}
	public String getTelefone() {
		return telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void emitirRelatorio() {
		System.out.println("==== FUNCIONARIO ===="
				+ "\nNUMERO DE REGISTRO: " + numeroRegistro
				+ "\nNOME: " + nome
				+ "\nNASCIMENTO: " + dataNascimento
				+ "\nSEXO: " + sexo
				+ "\nSETOR: " + setor
				+ "\nTELEFONE: " + telefone
				+ "\n\nENDERECO"
				+ "\nLOGRADOURO: " + endereco.getLogradouro()
				+ "\nNUMERO: " + endereco.getNumero()
				+ "\nBAIRRO: " + endereco.getBairro()
				+ "\nCIDADE: " + endereco.getCidade()
				+ "\nUNIDADE FEDERATIVA: " + endereco.getUnidadeFederativa()
				);
	}
}
