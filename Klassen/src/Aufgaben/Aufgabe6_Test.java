package Aufgaben;

import java.util.Scanner;

public class Aufgabe6_Test {

	public static void main(String[] args) {
		Tool info1 = new Tool("Fräse", 1500, 2021, 1500, 6000);
		Tool info2 = new Tool("Bandsäge", 1290, 2009, 145, 5000);
		Tool info3 = new Tool("Vorschlaghammer", 420, 2015, 187, 1000);
		Scanner in = new Scanner(System.in);
		int werkzeug;
		int stunden, minuten, jahr, betrag;
		String wahl;

		do {
			System.out.println("1. Werkzeug");
			System.out.println("Name: " + info1.getName() + "\nAnschaffungspreis: " + info1.getA_Preis()
					+ "\nAnschaffungsjahr: " + info1.getA_Jahr() + "\nAktuellerwert: " + info1.getWertAktuell()
					+ "\nGenutzte Stunden: " + info1.getN_Stunden() + "\n");

			System.out.println("2. Werkzeug");
			System.out.println("Name: " + info2.getName() + "\nAnschaffungspreis: " + info2.getA_Preis()
					+ "\nAnschaffungsjahr: " + info2.getA_Jahr() + "\nAktuellerwert: " + info2.getWertAktuell()
					+ "\nGenutzte Stunden: " + info2.getN_Stunden() + "\n");

			System.out.println("3. Werkzeug");
			System.out.println("Name: " + info3.getName() + "\nAnschaffungspreis: " + info3.getA_Preis()
					+ "\nAnschaffungsjahr: " + info3.getA_Jahr() + "\nAktuellerwert: " + info3.getWertAktuell()
					+ "\nGenutzte Stunden: " + info3.getN_Stunden() + "\n");

			System.out.println("Welches Werkzeug möchten Sie bearbeiten (1/2/3)");
			werkzeug = in.nextInt();

			switch (werkzeug) {
			case 1:
				System.out.println("Möchten Sie die genutzte Zeit erhöhen (z) oder den Wert erhöhen (w)");
				wahl = in.next();
				if (wahl.equalsIgnoreCase("z")) {
					System.out.println("Wie viele Stunden haben Sie ihr Werkzeug benutzt?");
					stunden = in.nextInt();
					System.out.println("Wie viele Minuten haben Sie ihr Werkzeug benutzt?");
					minuten = in.nextInt();
					info1.use(stunden, minuten);
				} else {
					System.out.println("Welches jahr wird der Wert erhöht?");
					jahr = in.nextInt();
					System.out.println("Um wie viel wollen Sie den Wert erhöhen?");
					betrag = in.nextInt();
					info1.update(jahr, betrag);
				}
				break;
			case 2:
				System.out.println("Möchten Sie die genutzte Zeit erhöhen (z) oder den Wert erhöhen (w)");
				wahl = in.next();
				if (wahl.equalsIgnoreCase("z")) {
					System.out.println("Wie viele Stunden haben Sie ihr Werkzeug benutzt?");
					stunden = in.nextInt();
					System.out.println("Wie viele Minuten haben Sie ihr Werkzeug benutzt?");
					minuten = in.nextInt();
					info2.use(stunden, minuten);
				} else {
					System.out.println("Welches jahr wird der Wert erhöht?");
					jahr = in.nextInt();
					System.out.println("Um wie viel wollen Sie den Wert erhöhen?");
					betrag = in.nextInt();
					info2.update(jahr, betrag);
				}
				break;
			case 3:
				System.out.println("Möchten Sie die genutzte Zeit erhöhen (z) oder den Wert erhöhen (w)");
				wahl = in.next();
				if (wahl.equalsIgnoreCase("z")) {
					System.out.println("Wie viele Stunden haben Sie ihr Werkzeug benutzt?");
					stunden = in.nextInt();
					System.out.println("Wie viele Minuten haben Sie ihr Werkzeug benutzt?");
					minuten = in.nextInt();
					info3.use(stunden, minuten);
				} else {
					System.out.println("Welches jahr wird der Wert erhöht?");
					jahr = in.nextInt();
					System.out.println("Um wie viel wollen Sie den Wert erhöhen?");
					betrag = in.nextInt();
					info3.update(jahr, betrag);
				}
				break;
			}
			System.out.println("Wollen Sie noch ein Werkzeug bearbeiten bzw. Ihre veränderungen sehen?(J/N)");
			wahl = in.next();

		} while (wahl.equalsIgnoreCase("J"));
		in.close();
	}
}
