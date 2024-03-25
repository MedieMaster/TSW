package Aufgabe1;

public class Artikel {
	private int id;
	private String bezeichnung;
	private int lagerBestand;
	private float preis;
	private String beschreibung;
	
	public Artikel(String bezeichnung, int id) {
		this.bezeichnung = bezeichnung;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public int getLagerBestand() {
		return lagerBestand;
	}

	public float getPreis() {
		return preis;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setLagerBestand(int lagerBestand) {
		this.lagerBestand = lagerBestand;
	}

	public void setPreis(float preis) {
		this.preis = preis;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public String toString() {
		return "Artikelnummer: " + id + ", Bezeichnung: " + bezeichnung + ", Lagerbestand: " + lagerBestand + ", Preis: "
				+ preis + ", Beschreibung: " + beschreibung;
	}
	
	
}
