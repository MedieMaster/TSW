package Aufgabe1;

public class Kurs_Test {

	public static void main(String[] args) {
		Kurs k1 = new Kurs(2, "Tanzen", 69);
	
		try {
			Teilnehmer t1 = new Teilnehmer(5, "boolean");
			
			if(k1.addTeilnehmer(t1))
				System.out.println("1. Teilnehmer: " + t1 + "\n");
			
		}catch(IllegalArgumentException ai) {
			System.out.println(ai.getMessage());
		}
		
		try {
			Teilnehmer t2 = new Teilnehmer(420, "jam");
			if(k1.addTeilnehmer(t2))
				System.out.println("2. Teilnehmer: " + t2 + "\n");
		}catch(IllegalArgumentException ai) {
			System.out.println(ai.getMessage());
		}
		
		System.out.println("Kurs: " + k1 + "\n");
		System.out.println("Einnahmen:" + k1.total() + "€");

	}

}
