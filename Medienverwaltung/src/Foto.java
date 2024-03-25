import java.util.Date;
import java.util.List;

public class Foto extends Medium {

	private int aufloesungX;
	private int aufloesungY;
	private List<String> personen;
	private String aufnahmeOrt;
	
	public Foto(long dateiGroesse, String name, String dateiFormat, Date erstellungsDatumZeit, String speicherOrt,
			int aufloesungX, int aufloesungY, List<String> personen, String aufnahmeOrt) {
		super(dateiGroesse, name, dateiFormat, erstellungsDatumZeit, speicherOrt);
		this.aufloesungX = aufloesungX;
		this.aufloesungY = aufloesungY;
		this.personen = personen;
		this.aufnahmeOrt = aufnahmeOrt;
	}

	public int getAufloesungX() {
		return aufloesungX;
	}

	public void setAufloesungX(int aufloesungX) {
		this.aufloesungX = aufloesungX;
	}

	public int getAufloesungY() {
		return aufloesungY;
	}

	public void setAufloesungY(int aufloesungY) {
		this.aufloesungY = aufloesungY;
	}

	public List<String> getPersonen() {
		return personen;
	}

	public String getAufnahmeOrt() {
		return aufnahmeOrt;
	}
	
	public void abspielen() {
		
	}

	public String toString() {
		return "Foto [aufloesungX=" + aufloesungX + ", aufloesungY=" + aufloesungY + ", personen=" + personen
				+ ", aufnahmeOrt=" + aufnahmeOrt + "]" + super.toString();
	}
	
	
}
