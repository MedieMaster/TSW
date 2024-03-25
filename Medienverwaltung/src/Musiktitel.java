import java.util.Date;

public class Musiktitel extends Medium{

	private String kuenstler;
	private String album;
	private int dauer;
	private int bitRate;
	private String genre;
	
	public Musiktitel(long dateiGroesse, String name, String dateiFormat, Date erstellungsDatumZeit, String speicherOrt,
			String kuenstler, String album, int dauer, int bitRate, String genre) {
		super(dateiGroesse, name, dateiFormat, erstellungsDatumZeit, speicherOrt);
		this.kuenstler = kuenstler;
		this.album = album;
		this.dauer = dauer;
		this.bitRate = bitRate;
		this.genre = genre;
	}

	public int getDauer() {
		return dauer;
	}

	public void setDauer(int dauer) {
		this.dauer = dauer;
	}

	public int getBitRate() {
		return bitRate;
	}

	public void setBitRate(int bitRate) {
		this.bitRate = bitRate;
	}

	public String getKuenstler() {
		return kuenstler;
	}

	public String getAlbum() {
		return album;
	}

	public String getGenre() {
		return genre;
	}
	
	public void abspielen() {
		
	}

	public String toString() {
		return "Musiktitel [kuenstler=" + kuenstler + ", album=" + album + ", dauer=" + dauer + ", bitRate=" + bitRate
				+ ", genre=" + genre + "]" + super.toString();
	}
	
}
