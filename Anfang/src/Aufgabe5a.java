import java.util.Scanner;

public class Aufgabe5a {
	
	public static void main(String[] args) {
		
		int reihe=0;
		int[] zahlen = new int[10];
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("***********************************");
		System.out.println("* Das kleine Einmaleins als Reihe *");
		System.out.println("***********************************");
		System.out.println();
		System.out.print("An welcher Reihe wollen Sie üben?: ");
		reihe = in.nextInt();
		System.out.println("Geben Sie nun 10 aufeinander folgende Zahlen der " + reihe + "er Reihe ein!");
		
		for (int i=0; i<10; i++) {
			
			zahlen[i] = in.nextInt();
		}
		
		System.out.print("Das sind Ihre Zahlen: ");
		
		for (int i=0; i<10; i++) {
			
			System.out.print(zahlen[i] + " ");
		}
		
		System.out.println();
		System.out.print("-Und das ist richtig: ");
		
		for (int i=0; i<10; i++) {
			
			System.out.print(reihe*(i+1) + " ");
		}
		in.close();
	}
}