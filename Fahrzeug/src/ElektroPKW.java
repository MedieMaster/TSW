
public class ElektroPKW extends PKW{

	private int akkuKapazitaet;
	
	public ElektroPKW(int raeder, double vMax, int ps, int personen, int akkuKapazitaet) {
		super(raeder, vMax, ps, personen);
		this.akkuKapazitaet = akkuKapazitaet;
	}

	public int getAkkuKapazitaet() {
		return akkuKapazitaet;
	}

	public void setAkkuKapazitaet(int akkuKapazitaet) {
		this.akkuKapazitaet = akkuKapazitaet;
	}

	public String toString() {
		return "Akkukapazität: " + akkuKapazitaet + " " + super.toString();
	}

}
