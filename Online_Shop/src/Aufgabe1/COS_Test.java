package Aufgabe1;
import java.util.Scanner;

public class COS_Test {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		Bestellverwaltung bv = new Bestellverwaltung();    
		bv.loadLists();
		
		int auswahl = 0;
		do {
			System.out.println();
			System.out.println("LPC - L�ttfeld PC-Shop *");
			System.out.println("----------------------");
			System.out.println();
			System.out.println("(1) Neuen Artikel erfassen");
			System.out.println("(2) Artikel l�#schen");
			System.out.println("(3) alle Artikel zeigen");
			System.out.println("(4) Neukunden anlegen");
			System.out.println("(5) Kunden l�schen");
			System.out.println("(6) alle Kunden zeigen");
			System.out.println("(7) Neue Bestellung aufnehmen");
			System.out.println("(8) Bestellung l�schen");
			System.out.println("(9) alle Bestellungen zeigen");
			System.out.println("(0) Ende");
			System.out.println();
			System.out.print("Auswahl: ");
			
			auswahl = eingabe.nextInt();
			eingabe.nextLine();
			System.out.println();
			
			switch (auswahl) {
			case 1:
				bv.neuArtikel();
				break;
			case 2:
				bv.removeArtikel();
				break;
			case 3:
				bv.showArtikel();		
				break;
			case 4:
				bv.neuKunde();
				break;
			case 5:
				bv.removeKunde();
				break;
			case 6:
				bv.showKunden();		
				break;
			case 7:
				bv.neuBestellung();
				break;
			case 8:
				bv.removeBestellung();
				break;	
			case 9:
				bv.showBestellungen();;		
				break;
			case 0:
				System.out.println("Programmende.");
				break;
			default:
				System.out.println("FEHLER: Auswahl existiert nicht!");
			}
		} while (auswahl != 0);
		
		eingabe.close();
	}
}