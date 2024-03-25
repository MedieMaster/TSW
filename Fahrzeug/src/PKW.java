
public class PKW extends Fahrzeug{

	private int ps;
	private int personen;
	
	public PKW(int raeder, double vMax, int ps, int personen) {
		super(raeder, vMax);
		this.ps = ps;
		this.personen = personen;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public int getPersonen() {
		return personen;
	}

	public void setPersonen(int personen) {
		this.personen = personen;
	}

	public String toString() {
		return "PS: " + ps + " " +"Personen: " + personen + " " + super.toString();
	}
	
	
	
}
