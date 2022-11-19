package aula16;

//Testando conceitos de Polimorfismo Sobrecarga (Overloading)
//Sobrecarga = métodos tendo o mesmo nome e situações diferentes (parâmetros)
public class Calculadora {
	//Criando a função calcularMedia com dois, três ou quatro parâmetros
	public Double calcularMedia(Double v1, Double v2) {
		return (v1+v2)/2;
	}
	public Double calcularMedia(Double v1, Double v2, Double v3) {
		return (v1+v2+v3)/3;
	}
	public Double calcularMedia(Double v1, Double v2, Double v3, Double v4) {
		return (v1+v2+v3+v4)/4;
	}
	
}
