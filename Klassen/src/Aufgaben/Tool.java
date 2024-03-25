package Aufgaben;

public class Tool {
	private String name;
	private double a_Preis;
	private int a_Jahr;
	private double wertAktuell;
	private int n_Stunden;
	
	public Tool(String name, double a_Preis,int a_Jahr, double wertAktuell, int n_Stunden) {
		this.n_Stunden=n_Stunden;
		this.name=name;
		this.a_Preis=a_Preis;
		this.wertAktuell=wertAktuell;
		this.a_Jahr=a_Jahr;
	}

	public String getName() {
		return name;
	}

	public double getA_Preis() {
		return a_Preis;
	}

	public int getA_Jahr() {
		return a_Jahr;
	}

	public double getWertAktuell() {
		return wertAktuell;
	}

	public int getN_Stunden() {
		return n_Stunden;
	}
	
	public void use(int std, int min) {
		this.wertAktuell = this.wertAktuell - ((this.a_Preis/this.n_Stunden)*std + (this.a_Preis/this.n_Stunden)/(float)60*min);
	}
	
	public void update(int jahr, double betrag) {
		if(jahr-this.a_Jahr>10) {
		}
		
		else {
			if((this.wertAktuell+betrag)>a_Preis) {
				this.wertAktuell=this.a_Preis;
			}
			else {
				this.wertAktuell+=betrag;
			}
		}
	}
}
