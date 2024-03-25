package Arbeit;
public class Mensa_nicolas {
	
	private String mensaName;
	private int anzahl_Speise;
	private Speise_nicolas[] Speisekarte;
	// Attribute:  3/3
	
	public Mensa_nicolas(String mensaName, int MaxSpeisenzahl) {
		this.mensaName = mensaName;
		Speisekarte = new Speise_nicolas[MaxSpeisenzahl];
		anzahl_Speise = 0;
	}
	// Parameterkonstruktor:  5/5
	
	public boolean addSpeise(Speise_nicolas S) {
		boolean jam = false;
		
		if(anzahl_Speise>=Speisekarte.length) {  //Fehler beim Vergleich (-1)
			Speisekarte[anzahl_Speise] = S;
			anzahl_Speise++;
			jam = true;
		}
		return jam;
	}	
	//addSpeise:  9/10
	
	public String evaluation() {
		int k1=0, k2=0, k3=0;
		
		for(int i=0; i>0; i++) {
			
			if(Speisekarte[i].getTyp().equals("Mischkost")) k1++;
			
			if(Speisekarte[i].getTyp().equals("vegetarisch")) k2++;
			
			if(Speisekarte[i].getTyp().equals("vegan")) k3++;
		}
		
		return "Mensa " + mensaName + "\nhat " + anzahl_Speise + " Speisen, davon " + k1 + " Mischkost, " + k2 + " vegetarisch, " + k3 + " vegan.";
		//Inhalt fehlt (-14)
	}
	//evaluation:  1/15
}
//class Mensa:  18/33