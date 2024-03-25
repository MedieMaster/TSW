package Aufgaben;

import java.util.Scanner;

public class Aufgabe6_Test_extra {

	public static void main(String[] args) {
		Tool info1 = new Tool("Fr�se", 1500, 2021, 1500, 6000);
		Tool info2 = new Tool("Bands�ge", 1290, 2009, 145, 5000);
		Tool info3 = new Tool("Vorschlaghammer", 420, 2015, 187, 1000);
		Tool[] test = {info1, info2, info3};
		Scanner in = new Scanner(System.in);
		int werkzeug;
		int stunden, minuten, jahr, betrag;
		String wahl;

		do {
			
			for(int i=0; i<3; i++) {
					
				System.out.println(i+1 +". Werkzeug");
				System.out.println("Name: " + test[i].getName() + "\nAnschaffungspreis: " + test[i].getA_Preis()
						+ "\nAnschaffungsjahr: " + test[i].getA_Jahr() + "\nAktuellerwert: " + test[i].getWertAktuell()
						+ "\nGenutzte Stunden: " + test[i].getN_Stunden() + "\n");
			}
				System.out.println("Welches Werkzeug m�chten Sie bearbeiten (1/2/3)");
				werkzeug = in.nextInt();
	
				System.out.println("M�chten Sie die genutzte Zeit erh�hen (z) oder den Wert erh�hen (w)");
				wahl = in.next();
				if (wahl.equalsIgnoreCase("z")) {
					System.out.println("Wie viele Stunden haben Sie ihr Werkzeug benutzt?");
					stunden = in.nextInt();
					System.out.println("Wie viele Minuten haben Sie ihr Werkzeug benutzt?");
					minuten = in.nextInt();
					test[werkzeug-1].use(stunden, minuten);
				} else {
					System.out.println("Welches jahr wird der Wert erh�ht?");
					jahr = in.nextInt();
					System.out.println("Um wie viel wollen Sie den Wert erh�hen?");
					betrag = in.nextInt();
					test[werkzeug-1].update(jahr, betrag);
				}
			
			System.out.println("Wollen Sie noch ein Werkzeug bearbeiten bzw. Ihre ver�nderungen sehen?(J/N)");
			wahl = in.next();
			
		} while (wahl.equalsIgnoreCase("J"));
		
	
		in.close();
	}
}
