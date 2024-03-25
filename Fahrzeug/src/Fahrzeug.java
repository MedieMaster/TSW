
public class Fahrzeug {
	
	private int raeder;
	private double vMax;
	int test = 5;
	
	public Fahrzeug(int raeder, double vMax) {
		this.raeder = raeder;
		this.vMax = vMax;
	}
	
	public int getRaeder() {
		return raeder;
	}
	public void setRaeder(int raeder) {
		this.raeder = raeder;
	}
	public double getvMax() {
		return vMax;
	}
	public void setvMax(double vMax) {
		this.vMax = vMax;
	}

	public String toString() {
		return "Räder: " + raeder + " " + "MaxGeschwindigkeit: " + vMax;
	}
	
	public void test() {
			System.out.print("Fahrzeug");
	}
	
}
