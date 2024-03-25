package Aufgabe1;

import java.util.Scanner;

public class CLI {

	public static void main(String[] args) {
		
		Bestellverwaltung bw = new Bestellverwaltung();
		Scanner in = new Scanner(System.in);
		boolean jam = true;
		int ausw;
		String jn;
		bw.AlleListenLaden();
		
		do {
			System.out.println("--- Menü ---");
			System.out.println("Artikel:");
			System.out.println("1 -- Artikel hinzufügen \n2 -- Artikel löschen \n3 -- Alle Artikel ausgeben\n");
			System.out.println("Kunden:");
			System.out.println("4 -- Kunden hinzufügen \n5 -- Kunden löschen \n6 -- Alle Kunden ausgeben\n");
			System.out.println("Bestellungen:");
			System.out.println("7 -- Bestellung hinzufügen \n8 -- Bestellung löschen \n9 -- Alle Bestellung ausgeben\n");
			
			System.out.println("Bitte auswahl tätigen");
			ausw = in.nextInt();
			switch(ausw) {
			case 1:
				bw.addArtikel();
				break;
			case 2: 
				bw.removeArtikel();
				break;
			case 3:
				bw.allArtikel();
				break;
			case 4:
				bw.addKunde();
				break;
			case 5:
				bw.removeKunde();
				break;
			case 6:
				bw.allKunde();
				break;
			case 7:
				bw.addBestellung();
				break;
			case 8:
				bw.removeBestellung();
				break;
			case 9:
				bw.AllBestellung();
				break;
			
			default:
				
			}
			
			System.out.println("Wollen Sie weitere Aktionen vornehmen?");
			jn = in.next();			
		}while(jn.equalsIgnoreCase("j"));
	}

}
