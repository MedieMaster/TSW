package Aufgaben;

public class Aufgabe1_2 {
	 String Klassenname, Klassenlehrer_name;
	 int anzahl_schueler, anzahl_woechentlichestunden;
	
	public String Getinfo() {
		String info = new String("Die " + Klassenname + " besteht aus " + anzahl_schueler + " Sch�lern,\r\n" + 
				"muss w�chentlich " + anzahl_woechentlichestunden + "h leisten\r\n" + 
				"und der Klassenlehrer ist " + Klassenlehrer_name);
	
		return info;
	}
}