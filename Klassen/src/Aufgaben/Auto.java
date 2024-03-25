package Aufgaben;

public class Auto {

	private String hersteller, modell, farbe;
	private float geschwindigkeit, tachostand;
	
	public Auto(String hersteller, String modell, String farbe, float tachostand) {
		this.hersteller=hersteller;
		this.modell=modell;
		this.farbe=farbe;
		this.tachostand=tachostand;
		this.geschwindigkeit=0;
	}
	
	public void beschleunigung(int stk) {
		if(stk>=0 && stk<=5) {
			this.geschwindigkeit = this.geschwindigkeit + (stk*10); 
			if(this.geschwindigkeit>210) {
				this.geschwindigkeit=210;
			}
		}
	}
	
	public void bremsen(int stk) {
		if(stk>=0 && stk<=5) {
			this.geschwindigkeit = this.geschwindigkeit - (stk*10); 
			if(this.geschwindigkeit<0) {
				this.geschwindigkeit=0;
			}
		}
	}
	
	public void fahren(int min, int std) {
		if(std>=0 || min>=0)
		this.tachostand = this.tachostand + (geschwindigkeit * std) + (geschwindigkeit * (min/(float)60));
	}
	
	public String getHersteller() {
		return hersteller;
	}
	
	public String getModell() {
		return modell;
	}
	
	public String getFarbe() {
		return farbe;
	}
	
	public float getGeschwindigkeit() {
		return geschwindigkeit;
	}
	
	public float getTachostand() {
		return tachostand;
	}
	
	
}
