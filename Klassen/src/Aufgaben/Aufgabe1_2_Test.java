package Aufgaben;

public class Aufgabe1_2_Test {

	public static void main(String[] args) {
		
		Aufgabe1_2 klasse = new Aufgabe1_2();
		
		klasse.Klassenname = "HIEA";
		klasse.Klassenlehrer_name = "Lindenberg";
		klasse.anzahl_schueler = 25;
		klasse.anzahl_woechentlichestunden = 38;
		
//		System.out.println("Unsere Klasse \n"
//				+ "------------- \n \n"
//				+ "Klasse: " + klasse.Klassenname + ", Klassenlehrer: " + klasse.Klassenlehrer_name );
//		
//		System.out.println("Anzahl Sch�ler: " + klasse.anzahl_sch�ler + ", Anzahl Wochenstunden: " + klasse.anzahl_w�chentlichestunden + "\n");
		
		System.out.print(klasse.Getinfo());
	}

}
