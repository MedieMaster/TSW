
public class Aufgabe7V2a {

	public static void main(String[] args) {
		
		double[] random = new double[10];
		int min=1;
		int max=3;
		int range = max - min + 1;
		
		
		for (int i=0; i<10; i++) {
			
			random[i] = (int)(Math.random() * range) + min;
			
			System.out.println(random[i]);
		}
	}

}
