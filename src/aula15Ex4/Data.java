package aula15Ex4;

public class Data {
	private Integer dia, mes, ano;
	
	public Data(Integer dia, Integer mes, Integer ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(Integer mes, Integer ano) {
		this(01, mes, ano);
	}
	
	public Data(Integer dia) {
		this(dia, 01, 2019);
	}
	
	public Data() {
		this(01, 01, 2019);
	}
	
	@Override
	public String toString() {
		return dia + "/" + mes +"/" + ano;
	}
}
