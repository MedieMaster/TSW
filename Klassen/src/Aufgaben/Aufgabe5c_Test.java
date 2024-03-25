package Aufgaben;

import java.util.Scanner;

public class Aufgabe5c_Test {

	public static void main(String[] args) {
		
		Aufgabe5c info = new Aufgabe5c("*****", "N.N");
		Scanner in = new Scanner(System.in);
		String jn = new String();
		
		System.out.println("********************\n"
				+ "* Klassenerfassung *\n"
				+ "********************");
		
		System.out.println("Hier ein Schema zur Orientierung: \n"
				+ "---------------------------------");
		System.out.print("Name der Klasse (5 Zeichen): " + info.getKlassenname());
		System.out.print("\nName des Klassenlehrers: " + info.getKlassenlehrer_name());
		System.out.print("\nAnzahl der Schüler - maximal 34: " + info.getAnzahl_schueler());
		System.out.println("\nAnzahl der Wochenstunden - maximal 40: " + info.getAnzahl_woechentlichestunden());
		System.out.println("\n*********************************\n"
				+ "* Nun bitte Ihre Daten eingeben *\n"
				+ "*********************************");
		
		System.out.println("\n****************************************************\n"
				+ "* Klassenerfassung - bitte folgende Daten eingeben *\n"
				+ "****************************************************\n");
		do {
			System.out.print("Name der Klasse: ");
			info.setKlassenname(in.nextLine());
			System.out.print("Name des Klassenlehrers: ");
			info.setKlassenlehrer_name(in.nextLine());
			System.out.print("Anzahl der Schueler - maximal 34: ");
			info.setAnzahl_schueler(in.nextInt());
			System.out.print("Anzahl der Wochenstunden - maximal 40: ");
			info.setAnzahl_woechentlichestunden(in.nextInt());
			
			System.out.println("Hier Ihre Daten zum Abgleich: ");
			System.out.println("Klasse: " + info.getKlassenname());
			System.out.println("Klassenlehrer: " + info.getKlassenlehrer_name());
			System.out.println("mit " + info.getAnzahl_schueler() + " Schuelern und " + info.getAnzahl_woechentlichestunden() + " Wochenstunden");
			
			System.out.print("Änderungen Notwendig (J/N) ?  ");
			jn = in.next();
		}while(jn.equalsIgnoreCase("J"));
		
		
		
		
		in.close();
	}

}