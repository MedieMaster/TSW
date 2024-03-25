package Klassenarbeit;

import java.util.Scanner;

public class Testprogramm {

	public static void main(String[] args) {
		Flight info = new Flight("Flug nach London", 440, 435, 129);
		Scanner in = new Scanner(System.in);
		String wahl;
		int quan;

		System.out.println("Unsere Schnäppchen: " + info.getDestination());
		System.out.println("zum Preis von: " + info.getPrice() + " Euro und hat noch " + (info.getNumber()-info.getOccupaied()) + " freie Plätze!");
		System.out.println("******************************************************");
		
		System.out.println("\nMöchten Sie buchen (J/N) ? ");
		wahl = in.next();
		// --------------- A1: 11/11 -------------
		
		if(wahl.equalsIgnoreCase("J")) {
			do {
				
				System.out.println("- Wie viele Plätze?: ");
				quan = in.nextInt();
				
				
				if(info.addreservation(quan) == 1000) {
					System.out.println("Nicht genügend frei Plätze.");
				}
				else {
					System.out.println("Bitte zahlen Sie " + info.addreservation(quan) + " Euro.");  //So wird die Reservierung 2mal gebucht (-2)
				}
				
				// --------------- A2: 5/7 -------------
				
				System.out.println("Aktuell noch " + (info.getNumber()-info.getOccupaied()) + " freie Plätze!");

				System.out.println("\nMöchten Sie buchen (J/N) ? ");
				wahl = in.next();
				
			}while(wahl.equalsIgnoreCase("J"));
			
		}

		System.out.println("Der Auslastungsgrad beträgt nun: " + info.utilisation() + "Prozent");
		System.out.println("\n=============================================");

		// --------------- A3: 4/4 -------------
		
		in.close();
	}

}
//---------------------------------
//class Flight:  22,5/25
//Main / Test:  20/22
//s/l:  4/4   
//-----------------------------------------
//Summe: 46,5/51  -  91,18%  -->  Note: 1-
//=========================================

