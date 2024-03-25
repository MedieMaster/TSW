package Aufgabe1;

import java.util.Arrays;

public class Array_Method {

	public static void main(String[] args) {

		int feld1[]= {4,7,1,1};
		int feld2[]= {4,7,1,1};

		//equals stellt Gleichheit fest

		if (Arrays.equals(feld1, feld2))
			System.out.println("sind gleich");

		else
			System.out.println("sind nicht gleich");

		System.out.println("Ende der Nachricht");

		// oder

		if (feld1.equals(feld2))
			System.out.println("sind gleich");

		else
			System.out.println("sind nicht gleich");

		System.out.println("Ende der Nachricht");


		//fill füllt alle Elemente

		Arrays.fill(feld2, 9);

		for(int zahl: feld2) {
			System.out.print(zahl);
		}

		System.out.println(" ");

		//sortieren der Größe nach

		Arrays.sort(feld1);
		for(int zahl: feld1) {
			System.out.print(zahl);
		}

		System.out.println(" ");
		//nach dem Sortieren, klappt auch das Suchen

		System.out.println("gesuchte Zahl steht auf Index "+Arrays.binarySearch(feld1, 7));

		int l = feld1.length;
	}
}
