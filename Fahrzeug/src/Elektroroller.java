
public class Elektroroller extends Motorroller{

	private int akkuKapazitaet;
	
	public Elektroroller(int raeder, double vMax, int akkuKapazitaet) {
		super(raeder, vMax);
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
