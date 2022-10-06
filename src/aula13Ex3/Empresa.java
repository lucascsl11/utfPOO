package aula13Ex3;

public class Empresa {
	private String cnpj, razaoSocial;
	private UnidadeFederativa uf;
	
	public Empresa(String cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	
	public void setUf(UnidadeFederativa uf) {
		this.uf = uf;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public void imprimirEmpresa() {
		System.out.println("CNPJ: " + cnpj
				+ "\nRAZAO SOCIAL: " + razaoSocial
				+ "\nLOCALIDADE: " + uf.getCapital()
				+ "\nUNIDADE FEDERATIVA: " + uf.getNomeUF() + " (" + uf.getSigla() + ")");
	}
}
