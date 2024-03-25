import java.util.Date;
import java.util.List;

public class Film extends Video{

	private List<String> sprachen;
	private String kategorie;
	private String beschreibung;
	private String regisseur;
	private String unterkategorie;
	private List<String> schauspieler;
	private double imdb;
	private List<String> sprachenUntertitel;
	
	public Film(long dateiGroesse, String name, String dateiFormat, Date erstellungsDatumZeit, String speicherOrt,
			int dauer, int aufloesungX, int aufloesungY, int wiederholungsrate, String kodierung, List<String> sprachen,
			String kategorie, String beschreibung, String regisseur, String unterkategorie, List<String> schauspieler,
			double imdb, List<String> sprachenUntertitel) {
		super(dateiGroesse, name, dateiFormat, erstellungsDatumZeit, speicherOrt, dauer, aufloesungX, aufloesungY,
				wiederholungsrate, kodierung);
		this.sprachen = sprachen;
		this.kategorie = kategorie;
		this.beschreibung = beschreibung;
		this.regisseur = regisseur;
		this.unterkategorie = unterkategorie;
		this.schauspieler = schauspieler;
		this.imdb = imdb;
		this.sprachenUntertitel = sprachenUntertitel;
	}

	public List<String> getSprachen() {
		return sprachen;
	}

	public void setSprachen(List<String> sprachen) {
		this.sprachen = sprachen;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public double getImdb() {
		return imdb;
	}

	public void setImdb(double imdb) {
		this.imdb = imdb;
	}

	public List<String> getSprachenUntertitel() {
		return sprachenUntertitel;
	}

	public void setSprachenUntertitel(List<String> sprachenUntertitel) {
		this.sprachenUntertitel = sprachenUntertitel;
	}

	public String getKategorie() {
		return kategorie;
	}

	public String getRegisseur() {
		return regisseur;
	}

	public String getUnterkategorie() {
		return unterkategorie;
	}

	public List<String> getSchauspieler() {
		return schauspieler;
	}

	public String toString() {
		return "Film [sprachen=" + sprachen + ", kategorie=" + kategorie + ", beschreibung=" + beschreibung
				+ ", regisseur=" + regisseur + ", unterkategorie=" + unterkategorie + ", schauspieler=" + schauspieler
				+ ", imdb=" + imdb + ", sprachenUntertitel=" + sprachenUntertitel + "]" + super.toString();
	}
	
	
	
}
