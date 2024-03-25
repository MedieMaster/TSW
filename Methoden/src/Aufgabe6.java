import java.util.Scanner;

public class Aufgabe6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		String wort1 = new String();
		String wort2 = new String();
		boolean y;

		
		System.out.println("kleine Wortanalyse \n"
				+ "------------------");
		
		System.out.print("Geben Sie ein Wort ein: ");
		wort1 = in.next();
		System.out.println("\n Das 1. Wort ist " + wort1.length() + "Zeichen lang");
		
		do {
		System.out.print("Geben Sie ein Wort ein: ");
		wort2 = in.next();
		System.out.println("\n Das 2. Wort ist " + wort2.length() + "Zeichen lang");
		
		if (wort2.equals(wort1)) {
			y = false;
		}
		}while(y);
		

	}

}
