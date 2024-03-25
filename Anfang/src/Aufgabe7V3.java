import java.util.Random;

public class Aufgabe7V3 {

	public static void main(String[] args) {
		
		double[] zahl = new double[10];
		Random random = new Random();
		
		
		for (int i=0; i<10; i++) {
			
			zahl[i] = (random.nextInt(3) + 2);
			
			System.out.println(zahl[i]);
		}
	}

}
