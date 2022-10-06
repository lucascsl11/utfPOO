package aula13Ex2;

public enum DiaSemana {
	//Podemos incluir indicadores ao colocar entre ()
	DOMINGO(1, "domingo"), 
	SEGUNDA(2, "segunda-feira"), 
	TERCA(3, "terça-feira"), 
	QUARTA(4, "quarta-feira"),
	QUINTA(5, "quinta-feira"), 
	SEXTA(6, "sexta-feira"), 
	SABADO(7, "sábado");
	//Aqui estamos "inicializando" os valores de um ENUM
	
	//Enums podem ter variáveis dentro
	private int numero;
	private String dia;
	
	//Incluindo detalhes a cada indicador como o número do dia e o dia por extenso
	private DiaSemana(int numero, String dia) {
		this.numero = numero;
		this.dia = dia;
	}
	
	public int getNumero() {
		return numero;
	}
	public String getDia() {
		return dia;
	}
}
