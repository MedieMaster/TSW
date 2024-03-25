import java.util.Scanner;
import java.util.Random;

public class Aufgabe7V4 {

	public static void main(String[] args) {
		
		int[] zahlen;
		Random ran = new Random();
		int z=0;
		int min=0;
		int max=0;
		int counter=0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("****************************************");
		System.out.println("* Zufall, Nichts als Zufall im Quadrat *");
		System.out.println("****************************************");
		System.out.println();
		System.out.print("Wie groﬂ (z x z) soll Ihr Zufallszahlenquadrat werden? ");
		z = in.nextInt();
		
		zahlen = new int[z*z];
		
		System.out.println();
		System.out.print("Zufallszahlen im Bereich von: ");
		min = in.nextInt();
		
		System.out.print("			 bis: ");
		max = in.nextInt();
		
		int range = max - min + 1;
		
		System.out.println();
		System.out.println("Da sind Ihre Zufallszahlen:");
		System.out.println("---------------------------");
		System.out.println();
		System.out.println();

		for (int i=0; i<(z*z); i++) {
			
			zahlen[i] = ran.nextInt(range) + min;
		}
		
		for (int i=0; i<z; i++) {
			
			for (int j=counter; j<z+counter; j++) {
				
				System.out.print(zahlen[j] + "	");
			}
			System.out.println();
			System.out.println();
			counter = counter + z;
		}
		
		in.close();
	}

}
