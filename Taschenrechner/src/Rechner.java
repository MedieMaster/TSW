import java.lang.Math;

public class Rechner {
	
	private double summe;
	
	public Rechner() {
		
	}
	public double add(double z1, double z2) {
		summe += z1 + z2;
		return z1 + z2;
	}
	public double sub(double z1, double z2) {
		summe += z1 - z2;
		return z1 - z2;
	}
	public double mult(double z1, double z2) {
		summe += z1 * z2;
		return z1 * z2;
	}
	public double div(double z1, double z2) {
		summe += z1 / z2;
		return z1 / z2;
	}
	private double potp(double z1, double z2) {
		//summe += Math.pow(z1, z2);
		//return Math.pow(z1, z2);
		/*double erg=z1;
		
		for(double i=(z2-(double)1); i>0; i--) {
			erg=erg*z1;
		}
		return erg;*/
		
		if(z2<=1) {
			return z1;
		}
		
		return potp(z1, z2-1) * z1;
		
	}
	public double pot(double z1, double z2) {
		
		if(z2<0) {
			return 1/potp(z1, z2*(-1));
		}
		else {
			return potp(z1, z2);
		}
		
	}
	public double root(double z1, double z2) {
		summe += Math.pow(z2, 1/z1);
		return Math.pow(z2, 1/z1);
	}
	public double mod(double z1, double z2) {
		summe += z1 % z2;
		return z1 % z2;
	}
	public double getSumme() {
		return summe;
	}
	
}
