import java.util.Random;
import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String[] args) {
		
		String ausw = new String();
		Random ran = new Random();
		Scanner in = new Scanner(System.in);
		int anzahl;
		
		do {
			System.out.println("Wie viele Zahlen sollen Erstellt werden?");
			anzahl = in.nextInt();
			int[] zahlen = new int[anzahl];
			
			for (int i=0; i<anzahl; i++) {
				zahlen[i] = ran.nextInt(9+1);
			}
			
			do {
				System.out.println("Wollen Sie das Minimum (M), Maximum (X), Modalwert (O), Durchschnitt (D) oder die Zahlen (A) ausgegeben haben");
				ausw = in.next();
				
				switch(ausw) {
					
				case "m":
				case "M":
					System.out.println("Ihre Minimum beträgt: " + min(zahlen, anzahl));
				break;
				
				case "x": 
				case "X":
					System.out.println("Ihr Maximum beträgt: " + max(zahlen, anzahl)); 
				break;
				
				case "d":
				case "D":
					System.out.println("Ihr Durchschnitt beträgt: " + durchschnitt(zahlen, anzahl));
				break;
				
				case "o":
				case "O":
					if (modal(zahlen, anzahl) > 10) {
						System.out.println("Fehler mit Modalwert");
					}
					else {
						System.out.println("Ihr Modalwert beträgt: " + modal(zahlen, anzahl));
					}
				break;
				
				case "a":
				case "A":
					System.out.print("Ihre Zahlen sind: ");
					for (int i=0; i<anzahl; i++) {
						System.out.print(zahlen[i] + ", ");
					}
					System.out.println();
				break;
				
				default:
					System.out.println("Falsch Eingabe");
				}
				
				System.out.println("Wollen Sie mehr ausgeben?(J/N)");
				ausw = in.next();
			}while(ausw.contentEquals("J") || ausw.contentEquals("j"));
			
			System.out.println("Wollen Sie das Program erneut starten?(J/N) ");
			ausw = in.next();
		}while(ausw.contentEquals("J") || ausw.contentEquals("j"));
		in.close();
	}
	
	static int max(int[] zahlen, int anzahl) {
		int erg=0;
		
		for (int i=0; i<anzahl; i++) {
			if (erg<zahlen[i]) {
				erg = zahlen[i];
			}
		}
		return erg;
		
	}
	
	static int min(int[] zahlen, int anzahl) {
		int erg=10;
		
		for (int i=0; i<anzahl; i++) {
			if (erg>zahlen[i]) {
				erg = zahlen[i];
			}
		}
		return erg;
	}
	
	static float durchschnitt(int[] zahlen, int anzahl) {
		float erg=0;
		
		for (int i=0; i<anzahl; i++) {
			erg+=zahlen[i];
		}
		erg/=anzahl;
		return erg;
	}
	static int modal(int[] zahlen, int anzahl) {
		int erg=0;
		int maxcount=0;
		
		for(int i=0; i<anzahl; i++) {
			int counter=0;
			for (int j=0; j<anzahl; j++) {
				if (zahlen[j] == zahlen[i]) {
					counter+=1;
				}
				
			}
			if (maxcount<counter) {
				maxcount=counter;
				erg=zahlen[i];
			}
			if (maxcount == counter) {
				erg=11;

			}
		
		}
		if (maxcount == 1) {
			erg=10;
		}
		return erg;
	}
}
