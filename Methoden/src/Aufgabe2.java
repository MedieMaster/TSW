import java.util.Scanner;

public class Aufgabe2 {
	
	
	static void title(int strich) {
		
		System.out.println("Herzlich Willkommen");
		
		for (int i=0; i<strich; i++) {
			System.out.println("-------------------");
		}
		
	}

	public static void main(String[] args) {
		
		int anzahl;
		Scanner in = new Scanner(System.in);
		
		System.out.print("W�hlen Sie die Anzahl der Unterstreichungen f�r die �berschrift: ");
		anzahl = in.nextInt();
		
		
		title(anzahl);
		in.close();
	}

}
