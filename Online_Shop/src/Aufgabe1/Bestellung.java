package Aufgabe1;

import java.util.ArrayList;

public class Bestellung {
	private int id;
	private ArrayList<Artikel> Artikelliste = new ArrayList<Artikel>();
	private Kunde kunde;
	
	public Bestellung(int id, Kunde kunde) {
		this.id = id;
		this.kunde = kunde;
	}

	public int getId() {
		return id;
	}

	public ArrayList<Artikel> getArtikelliste() {
		return Artikelliste;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setArtikelliste(ArrayList<Artikel> artikelliste) {
		Artikelliste = artikelliste;
	}
	
	public float getGesamtpreis() {
		float total = 0;
		for(int i=0; i<Artikelliste.size(); i++) {
			total = total + Artikelliste.get(i).getPreis();
		}
		return total;
	}
	
	public void addArtikel(Artikel a) {
		Artikelliste.add(a);
		System.out.println("Artikel wurde erfolgreich hinzugefügt");
	}
	
	public void removeArtikel(int index) {
		Artikelliste.remove(index);
		System.out.println("Artikel wurde erfolgreich entfer");
	}

	@Override
	public String toString() {
		return "Bestellungsnummer: " + id + ", Kundenname: " + kunde.getVorname() + ", Gesamtpreis: "
				+ getGesamtpreis() + ", Anzahl der Artikel: " + Artikelliste.size();
	}


	
	
}
