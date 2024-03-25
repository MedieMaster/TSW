import java.util.Random;
import java.util.Scanner;

public class Aufgabe8 {

	public static void main(String[] args) {
		
		System.out.println("*********************************************");
		System.out.println("* Erfassung und Auswertung von Zahlenreihen *");
		System.out.println("*********************************************");
		
		Scanner in = new Scanner(System.in);
		Random ran = new Random();
		char menu;
		
		do {
			int[] zahlen;
			int auswahl=0, menge=0, min=0, max=0, range=0;
			
			do {
				
				System.out.print("Möchten Sie mit eigenen Zahlen (1) oder Zufallszahlen (2) benutzen? ");
				auswahl = in.nextInt();
				
				if (auswahl<=0) {
					System.out.println("Falsche Eingabe, Bitte versuchen Sie es erneut");
				}
				
			} while(auswahl<=0 || auswahl>2);
			
			
			System.out.print("Wie viele Zahlen benötigen Sie?: ");
			menge = in.nextInt();
			System.out.println();
			zahlen = new int[menge];
				
			System.out.print("In welchem Beriech sollen die Zahlen liegen? Von: ");
			min = in.nextInt();
			System.out.println();
			System.out.print("                                             Bis: ");
			max = in.nextInt();
			
			range = max-min+1;
			
			if (auswahl==1) {
				
				for (int i=0; i<menge; i++) {
					
					do {
					
						System.out.print((i+1) + ". Zahl");
						zahlen[i] = in.nextInt();
						
						if (zahlen[i] < min || zahlen[i] > max) {
							System.out.println("Falsche Eingabe");
						}
					} while(zahlen[i] < min || zahlen[i] > max);	
				}
			}
			
			else {
				
				for (int i=0; i<menge; i++) {
					
					zahlen[i] = ran.nextInt(range) + min;
				}
				
			}
			
			do {
				System.out.println("Folgende Aktionen stehen zur Verfügung: ");
				System.out.println();
				System.out.println("(A/a) - Anzeige der Zahlen \n"
						+ "(K/k) - Ermittlung der kleinsten Zahl \n"
						+ "(G/g) - Ermittlung der größten Zahl \n" 
						+ "(M/m) - Berechnung des Mittelwertes \n"
						+ "(E/e) - Ende \n"
						+ "Ihre Wahl: ");
				
				menu = in.next().charAt(0);
		
				switch (menu) {
				
					case 'A' :
					case 'a' : 
						for (int i=0; i<menge; i++) {
							System.out.println((i+1) + ". Zahl: " + zahlen[i]);
						}
						break;
						
					case 'K' :
					case 'k' :
						min = max;
						for (int i=0; i<menge; i++) {
							
							if (zahlen[i]<min) {
								min = zahlen[i];
							}
						}
						System.out.println("Min: " + min);
						break;
					case 'G' :
					case 'g' :
						max = min;
						for (int i=0; i<menge; i++) {
							
							if (zahlen[i]>max) {
								max = zahlen[i];
							}
						}
						System.out.println("Max: " + max);
						break;
					case 'M' :
					case 'm' :
						double mittelwert=0;
						for (int i=0; i<menge; i++) {
							mittelwert += zahlen[i];
						}
						mittelwert /= menge;
						System.out.println("Mittelwert: " + mittelwert);
						break;
					case 'E' :
					case 'e' :
						break;
					default : 
						System.out.println("falsche Eingabe");
						
				}
			} while(menu != 'E' && menu != 'e');
			
			System.out.println("Wollen Sie das Programm für eine neue Zahlenreihe starten (J/N): ");
			menu = in.next().charAt(0);
			
		} while(menu == 'J' || menu == 'j');
		in.close();
	}
}