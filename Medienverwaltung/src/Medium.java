import java.util.Date;

public class Medium {

	private long dateiGroesse;
	private String name;
	private String dateiFormat;
	private Date erstellungsDatumZeit;
	private String speicherOrt;
	
	public Medium(long dateiGroesse, String name, String dateiFormat, Date erstellungsDatumZeit, String speicherOrt) {
		this.dateiGroesse = dateiGroesse;
		this.name = name;
		this.dateiFormat = dateiFormat;
		this.erstellungsDatumZeit = erstellungsDatumZeit;
		this.speicherOrt = speicherOrt;
	}

	public long getDateiGroesse() {
		return dateiGroesse;
	}

	public void setDateiGroesse(long dateiGroesse) {
		this.dateiGroesse = dateiGroesse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeicherOrt() {
		return speicherOrt;
	}

	public void setSpeicherOrt(String speicherOrt) {
		this.speicherOrt = speicherOrt;
	}

	public String getDateiFormat() {
		return dateiFormat;
	}

	public Date getErstellungsDatumZeit() {
		return erstellungsDatumZeit;
	}
	
	public void abspielen() {
		
	}

	public String toString() {
		return "Medium [dateiGroesse=" + dateiGroesse + ", name=" + name + ", dateiFormat=" + dateiFormat
				+ ", erstellungsDatumZeit=" + erstellungsDatumZeit + ", speicherOrt=" + speicherOrt + "]";
	}
	
	
	
}
