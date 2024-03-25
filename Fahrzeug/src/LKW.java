
public class LKW extends Fahrzeug{

	private double length;
	private double maxWeight;
	private double maxVolume;
	
	public LKW(int raeder, double vMax, double length, double maxWeight, double maxVolume) {
		super(raeder, vMax);
		this.length = length;
		this.maxWeight = maxWeight;
		this.maxVolume = maxVolume;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	public double getMaxVolume() {
		return maxVolume;
	}

	public void setMaxVolume(double maxVolume) {
		this.maxVolume = maxVolume;
	}

	public String toString() {
		return "Länge: " + length + " " + "MaxGewicht: " + maxWeight + " " + "MaxVolumen: " + maxVolume + " " + super.toString();
	}
	
	
	
}
