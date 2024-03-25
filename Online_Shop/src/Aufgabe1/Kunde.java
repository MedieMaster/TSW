package Aufgabe1;

public class Kunde {
	private int id;
	private String name;
	private String vorname;
	private String Adresse;
	private String email;
	private String tele;
	private String kontoinfo;
		
	public Kunde(int id, String name, String vorname) {
		this.id = id;
		this.name = name;
		this.vorname = vorname;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getVorname() {
		return vorname;
	}

	public String getAdresse() {
		return Adresse;
	}

	public String getEmail() {
		return email;
	}

	public String getTele() {
		return tele;
	}

	public String getKontoinfo() {
		return kontoinfo;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}

	public void setKontoinfo(String kontoinfo) {
		this.kontoinfo = kontoinfo;
	}

	public String toString() {
		return "Kundennummer: " + id + ", Nachname: " + name + ", Vorname: " + vorname;
	}
	
	
}
