
public class VerbrennerPKW extends PKW{

	private double verbrauch;
	
	public VerbrennerPKW(int raeder, double vMax, int ps, int personen, double verbrauch) {
		super(raeder, vMax, ps, personen);
		this.verbrauch = verbrauch;
	}

	public double getVerbrauch() {
		return verbrauch;
	}

	public void setVerbrauch(double verbrauch) {
		this.verbrauch = verbrauch;
	}

	public String toString() {
		return "Verbrauch: " + verbrauch + " " + super.toString();
	}
	
}
