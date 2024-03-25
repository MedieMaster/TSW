package Aufgabe1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bestellverwaltung {
	private ArrayList<Artikel> Artikelliste = new ArrayList<Artikel>();
	private ArrayList<Kunde> Kundenliste = new ArrayList<Kunde>();
	private ArrayList<Bestellung> Bestellliste = new ArrayList<Bestellung>();
	private Scanner in = new Scanner(System.in);
	
	public Bestellverwaltung() {
	}
	
	public void loadLists() {
		Artikel a1 = new Artikel("Johnny Sins Actionfigur", 1000);
		a1.setPreis(10);
		a1.setLagerBestand(20);
		a1.setBeschreibung("gutes Prdoukt");
		
		Artikel a2 = new Artikel("Drachenlord Actionfigur", 1001);
		a2.setPreis(69);
		a2.setLagerBestand(420);
		a2.setBeschreibung("Bestes Ding ever");
		
		Kunde k1 = new Kunde(8000, "Mueller", "Marlon");
		k1.setAdresse("Muellerstraße 1");
		k1.setEmail("Marlon.Mueller@gmail.com");
		k1.setKontoinfo("69420");
		k1.setTele("69420");
		
		Kunde k2 = new Kunde(8001, "Haasler", "Robin");
		k2.setAdresse("Haaslerstraße 5");
		k2.setEmail("Robin.Haasler@gmail.com");
		k2.setKontoinfo("42069");
		k2.setTele("42069");
		
		Artikelliste.add(a1);
		Artikelliste.add(a2);
		Kundenliste.add(k1);
		Kundenliste.add(k2);
	}
	
	public void neuArtikel() {
		int id;
		String bezeichnung;
		System.out.println("Bitte geben Sie die Daten des neuen Artikels ein.");
		boolean jam = false;
		do {
			jam = false;
			System.out.println("ID(Muss zwischen 1000-6999 liegen): ");
			id = in.nextInt();
			in.nextLine();
			if(id>=1000 && id<=6999) {
				for(int i=0; i<Artikelliste.size(); i++) {
					if(id == Artikelliste.get(i).getId()) {
						jam = false;
						i = Artikelliste.size();
						System.out.println("Die ID ist bereits vergeben");
					}
					else {
						jam = true;
					}
				}
			}
			else {
				jam = false;
				System.out.println("Ungültige ID");
			}
		}while(jam == false);
		System.out.println("Bezeichnung: ");
		bezeichnung = in.nextLine();
		Artikel a = new Artikel(bezeichnung, id);
		System.out.println("Beschreibung: ");
		a.setBeschreibung(in.nextLine());
		System.out.println("lagerbestand: ");
		a.setLagerBestand(in.nextInt());
		System.out.println("preis: ");
		a.setPreis(in.nextFloat());
		
		Artikelliste.add(a);
	}
	
	public void removeArtikel() {
		int id;
		boolean jam = false;
		System.out.println("ID des Produkts: ");
		id = in.nextInt();
		
		for(int i=0; i<Artikelliste.size(); i++) {
			if(Artikelliste.get(i).getId() == id) {
				Artikelliste.remove(i);
				jam = true;
			}
		}
		
		if(jam == false) {
			System.out.println("Keine Produkt mit der id: " + id + " gefunden");
		}
		else {
			System.out.println("Produkt erfolgreich entfernt");
		}
	}
	
	public void showArtikel() {
		for(int i=0; i<Artikelliste.size(); i++) {
			System.out.println(Artikelliste.get(i));
		}
	}
	
	public void neuKunde() {
		int id;
		String name;
		String vorname;
		boolean jam;
		
		do {
			jam = false;
			System.out.println("ID(Muss zwischen 8000-8999 liegen): ");
			id = in.nextInt();
			in.nextLine();
			if(id>=8000 && id<=8999) {
				for(int i=0; i<Kundenliste.size(); i++) {
					if(id == Kundenliste.get(i).getId()) {
						jam = false;
						i = Kundenliste.size();
						System.out.println("Die ID ist bereits vergeben");
					}
					else {
						jam = true;
					}
				}
			}
			else {
				jam = false;
				System.out.println("Ungültige ID");
			}
		}while(jam == false);
		
//		System.out.println("ID: ");
//		id = in.nextInt();
		System.out.println("Vorname: ");
		vorname = in.nextLine();
		System.out.println("Name: ");
		name = in.nextLine();
		Kunde k = new Kunde(id, name, vorname);
		System.out.println("Adresse: ");
		k.setAdresse(in.nextLine());
		System.out.println("E-mail: ");
		k.setEmail(in.nextLine());
		System.out.println("Telefonnummer: ");
		k.setTele(in.nextLine());
		System.out.println("Kontoinfo: ");
		k.setKontoinfo(in.nextLine());
		
		Kundenliste.add(k);
	}
	
	public void removeKunde() {
		int id;
		boolean jam = false;
		System.out.println("ID des Kunden: ");
		id = in.nextInt();
		
		for(int i=0; i<Kundenliste.size(); i++) {
			if(Kundenliste.get(i).getId() == id) {
				Kundenliste.remove(i);
				jam = true;
			}
		}
		
		if(jam == false) {
			System.out.println("Kein Kunde mit der id: " + id + " gefunden");
		}
		else {
			System.out.println("Kunde erfolgreich entfernt");
		}
	}
	
	public void showKunden() {
		for(int i=0; i<Kundenliste.size(); i++) {
			System.out.println(Kundenliste.get(i));
		}
	}
	
	public void neuBestellung() {
		int bid, kid, aid;
		String jn;
		boolean jam = false;
		Kunde k = null;
		System.out.println("Wie lautet die Nummer der Bestellung?");
		bid = in.nextInt();
		do {
			
			System.out.println("Wie lautet die Nummer des Kunden?");
			kid = in.nextInt();
			
			for(int i=0; i<Kundenliste.size(); i++) {
				if(Kundenliste.get(i).getId() == kid) {
					jam = true;	
					k = Kundenliste.get(i);
				}
			}
			if(jam == false) {
				System.out.println("Es existiert kein Kunde mit dieser Nummer");
			}
		}while(jam==false);

		
		Bestellung b = new Bestellung(bid, k);
		jam = false;
		
		do {
			System.out.println("Wie lautet die Artikelnummer?");
			aid = in.nextInt();
			
			for(int i=0; i<Artikelliste.size(); i++) {
				if(Artikelliste.get(i).getId() == aid && Artikelliste.get(i).getLagerBestand() >=1) {
					jam = true;
					Artikelliste.get(i).setLagerBestand(Artikelliste.get(i).getLagerBestand()-1);
					b.addArtikel(Artikelliste.get(i));

				}
			}

			if(jam == false) {
				System.out.println("Artikel nicht gefunden");
			}
			
			System.out.println("Wollen Sie noch einen Artikel hinzufügen?");
			jn = in.next();
			
		}while(jn.equalsIgnoreCase("j"));
		
		if(jam) {
			Bestellliste.add(b);
							
		}
		
		System.out.println("Wollen Sie die Bestellung abbrechen?(J/N)");
		jn = in.next();
		
		if(jn.equalsIgnoreCase("j")) {
			for(int i=0; i<b.getArtikelliste().size(); i++) {
				for(int j=0; j<Artikelliste.size(); j++)
				if(b.getArtikelliste().get(i) == Artikelliste.get(j)) {
					Artikelliste.get(j).setLagerBestand(Artikelliste.get(j).getLagerBestand()+1);
				}
			}
			b = null;
		}

		
	}
	
	public void showBestellungen() {
		for(int i=0; i<Bestellliste.size(); i++) {
			System.out.println(Bestellliste.get(i));
		}
		int id = 0;
		String test;
		System.out.println("Wollen Sie die Artikel von einer Bestellung sehen?");
		test = in.next();
		if(test.equalsIgnoreCase("j")) {
			System.out.println("Von welcher Bestellung wollen Sie die Artikel sehen?");
			id = in.nextInt();
			
			for(int i=0; i<Bestellliste.size(); i++) {
				if(Bestellliste.get(i).getId() == id) {
					System.out.println(Bestellliste.get(i).getArtikelliste());
				}
			}
			
		}
		
	}
	
	public void removeBestellung() {
		int id;
		boolean jam = true;
		System.out.println("ID der Bestellung: ");
		id = in.nextInt();
		
		for(int i=0; i<Bestellliste.size(); i++) {
			if(Bestellliste.get(i).getId() == id) {
				Bestellliste.remove(i);
				jam = false;
			}
		}
		
		if(jam) {
			System.out.println("Keine Bestellung mit der id: " + id + " gefunden");
		}
		else {
			System.out.println("Bestellung erfolgreich entfernt");
		}
		
	}
}
