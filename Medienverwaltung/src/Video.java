import java.util.Date;

public class Video extends Medium{

	private int dauer;
	private int aufloesungX;
	private int aufloesungY;
	private int wiederholungsrate;
	private String kodierung;
	
	public Video(long dateiGroesse, String name, String dateiFormat, Date erstellungsDatumZeit, String speicherOrt,
			int dauer, int aufloesungX, int aufloesungY, int wiederholungsrate, String kodierung) {
		super(dateiGroesse, name, dateiFormat, erstellungsDatumZeit, speicherOrt);
		this.dauer = dauer;
		this.aufloesungX = aufloesungX;
		this.aufloesungY = aufloesungY;
		this.wiederholungsrate = wiederholungsrate;
		this.kodierung = kodierung;
	}

	public int getDauer() {
		return dauer;
	}

	public void setDauer(int dauer) {
		this.dauer = dauer;
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

	public int getWiederholungsrate() {
		return wiederholungsrate;
	}

	public String getKodierung() {
		return kodierung;
	}
	
	public void abspielen() {
		
	}

	public String toString() {
		return "Video [dauer=" + dauer + ", aufloesungX=" + aufloesungX + ", aufloesungY=" + aufloesungY
				+ ", wiederholungsrate=" + wiederholungsrate + ", kodierung=" + kodierung + "]" + super.toString();
	}
	
}
