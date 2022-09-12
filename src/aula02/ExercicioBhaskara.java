package aula02;
import java.lang.Math;

public class ExercicioBhaskara {
	public static void main(String[] args) {
		double a = 1, b = 1; //, c = 1;
		double delta = 9;
		//delta = (b * b) - (4 * a * c)
		
		//Se delta der um termo que não dá pra fazer raiz, o resultado dá NaN
		double x = (-b + Math.sqrt(delta)) / (2 * a);
		
		System.out.println(x);
	}
}
