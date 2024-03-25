import java.util.Scanner;
import java.lang.Math;

public class Aufgabe3_4 {
	
	static double kugel(double rad) {
		double erg;
		erg=(double)4/3*rad*rad*rad*Math.PI;
		return erg;
		
	}
	
	static double hkugel(double rad) {
		double erg;
		erg=(double)4/3*rad*rad*rad*Math.PI/2;
		return erg;
		
	}

	static double zylinder(double rad, double height) {
		double erg;
		erg=rad*rad*Math.PI*height;
		return erg;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		char ausw;
		double rad, height, erg;
		
		System.out.println("Welchen Körper wollen Sie auswählen");
		System.out.println("K/k Kugel\n"
				+ "H/h Halbkugel \n"
				+ "Z/z Zylinder");
		
		ausw = in.next().charAt(0);
		
		System.out.print("Ihre Wahl: " + ausw + "\n");
		
		switch (ausw) {
		
		case 'K': 
		case 'k':
			System.out.print("Wie lautet der Radius: ");
			rad = in.nextDouble();
			erg = kugel(rad);
			System.out.print("Kugel: \n"
					+ "Das Volumen beträgt: " + kugel(rad));
			break;
			
		case 'H':
		case 'h':
			System.out.print("Wie lautet der Radius: ");
			rad = in.nextDouble();
			erg = hkugel(rad);
			System.out.print("Halbkugel: \n"
					+ "Das Volumen beträgt: " + erg);
			break;
			
		case 'Z':
		case 'z':
			System.out.print("Wie lautet der Radius: ");
			rad = in.nextDouble();
			System.out.print("Wie lautet die Höhe: ");
			height = in.nextInt();
			erg = zylinder(rad, height);
			System.out.print("Zylinder: \n"
					+ "Das Volumen beträgt: " + erg);
			break;
			
		default: 
			System.out.println("Fehler");
			break;
		}
		in.close();
	}
}