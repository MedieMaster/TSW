package Aufgaben;

public class Aufgabe3_Test {

	public static void main(String[] args) {
		
		Aufgabe3 klasse = new Aufgabe3();
		
		klasse.setKlassenname("HIE2A"); 
		klasse.setKlassenlehrer_name("Lindenberg");
		klasse.setAnzahl_schueler(25); 
		klasse.setAnzahl_woechentlichestunden(38); 
		
		System.out.println("Unsere Klasse \n"
				+ "------------- \n \n"
				+ "Klasse: " + klasse.getKlassenname() + ", Klassenlehrer: " + klasse.getKlassenlehrer_name() );
		
		System.out.println("Anzahl Sch�ler: " + klasse.getAnzahl_schueler() + ", Anzahl Wochenstunden: " + klasse.getAnzahl_woechentlichestunden() + "\n");
		
	}

}