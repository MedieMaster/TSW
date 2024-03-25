
public class Aufgabe6 {

	public static void main(String[] args) {
		
		int[] tage = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.println("Die Tage in den einzelnen Monaten:");
		System.out.println("----------------------------------");
		
		for (int i=0; i<12; i++) {
			
			System.out.print("Monat " + (i+1) + ": ");
			
			for (int j=0; j<tage[i]; j++) {
				System.out.print((j+1) + " ");
			}
			System.out.println();
		}
		

	}

}
