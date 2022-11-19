package aula16;
import java.text.SimpleDateFormat;
import java.util.Date; //Biblioteca para manipulação de datas

public class Data {
	private String data;
	
	//Múltiplos métodos sendo chamados com o mesmo nome
	
	public void atribuirData() {
		Date hoje = new Date();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		this.data = df.format(hoje); //Essa função formata uma Date pra uma datetime string
	}
	
	public void atribuirData(String data) {
		this.data = data;
	}
	
	public void atribuirData(int dia, int mes, int ano) {
		this.data = dia + "/" + mes + "/" + ano;
	}
	
	
}
