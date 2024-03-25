package Arbeit;
public class Speise_nicolas {
	
	private String name;
	private int kcal;
	private int typ;
	// Attribute:  2/2 
	
	public Speise_nicolas(String name, int kcal, int typ) {
		this.name = name;
		this.kcal = kcal;
		if(typ>3 || typ<1) 
			throw new IllegalArgumentException(name + " ist unzulaessig");
		this.typ = typ;
	}
	// Parameterkonstruktor: 8/8
	
	public String toString() {
		return "Mensa_nicolas [name=" + name + ", kcal=" + kcal + ", typ=" + typ + "]";
	}
	//toString:  2/2
	
	public String getTyp() {
		String typ2 = new String();
		if(typ==1)
			typ2 = new String("Mischkost");
		if(typ==2)
			typ2 = new String("vegetarisch");
		if(typ==3)
			typ2 = new String("vegan");
		return typ2;
	}
	//get:  1/1  + 4 Zusatzpunkte f�r return als string -->  5/1
}
//class Speise:  17/13