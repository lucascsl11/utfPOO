package aula17Ex1;

public class Losango extends Quadrilatero {
	private Double diagonalMenor, diagonalMaior;
	
	public Losango(Double diagonalMenor, Double diagonalMaior) {
		this.diagonalMenor = diagonalMenor;
		this.diagonalMaior = diagonalMaior;
	}
	
	@Override
	public void calcularArea() {
		System.out.println((diagonalMaior * diagonalMenor)/2);
	}
}
