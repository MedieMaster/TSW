
public class Kunden {
	
	private int kdNr;
	private String vorname;
	private String nachname;
	private String adresse;
	
	public Kunden(int kdNr, String vorname, String nachname, String adresse) {
		this.kdNr = kdNr;
		this.vorname = vorname;
		this.nachname = nachname;
		this.adresse = adresse;
	}

	public String toString() {
		return "Kundennummer: " + kdNr + " | Vorname: " + vorname + " | Nachname: " + nachname + " | Adresse: " + adresse;
	}

	public int getKdNr() {
		return kdNr;
	}

	public void setKdNr(int kdNr) {
		this.kdNr = kdNr;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	
}
