package Aufgaben;

import java.util.Scanner;

public class Auto_Test {

	public static void main(String[] args) {
		Auto info1 = new Auto("Opel", "Astra", "Rot", 25000);
		Auto info2 = new Auto("Ford", "Mustang", "Lila", 0);
		Scanner in = new Scanner(System.in);
		String wahl;
		int staerke, minuten, stunden;

		do {

			System.out.println("1. Auto: \n" + "Hersteller: " + info1.getHersteller() + "\nModell: " + info1.getModell()
					+ "\nFarbe: " + info1.getFarbe() + "\nTachostand: " + info1.getTachostand() + "\nGeschwindigkeit: "
					+ info1.getGeschwindigkeit());

			System.out.println("Wollen sie beschleunigen (b), bremsen (x) oder fahren (f)?");
			wahl = in.next();

			switch (wahl) {

			case "b":
			case "B":
				System.out.println("Wie stark wollen Sie beschleunigen? Sie können von 1 bis 5.");
				staerke = in.nextInt();
				info1.beschleunigung(staerke);
				break;

			case "x":
			case "X":
				System.out.println("Wie stark wollen Sie bremsen? Sie können von 1 bis 5.");
				staerke = in.nextInt();
				info1.bremsen(staerke);
				break;

			case "f":
			case "F":
				System.out.println("Wie viele Stunden sind Sie gefahren?");
				stunden = in.nextInt();
				System.out.println("Wie viele Minuten sind Sie gefahren?");
				minuten = in.nextInt();

				info1.fahren(minuten, stunden);

				System.out.println("Ihr Tachostand beträgt: " + info1.getTachostand());
				break;

			}

			System.out.println("Wollen Sie noch etwas machen?(J/N)");
			wahl = in.next();
		} while (wahl.equalsIgnoreCase("j"));

		in.close();
	}

}
