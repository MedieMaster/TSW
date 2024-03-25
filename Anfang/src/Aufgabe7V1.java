import java.lang.Math;

public class Aufgabe7V1 {

	public static void main(String[] args) {
		
		double[] random = new double[10];
		
		
		for (int i=0; i<10; i++) {
			
			random[i] = Math.random();
		}
		
		for (int i=0; i<10; i++) {
			
			System.out.println(random[i]);

		}

	}

}
