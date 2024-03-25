import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		
		int spalten=0, zeilen=0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("*************************");
		System.out.println("* Das kleine Einmaleins *");
		System.out.println("*************************");
		System.out.println();
		
		System.out.print("Wie viele Spalten?:");
		spalten =in.nextInt();
		System.out.println();
		
		System.out.print("Wie viele Zeilen?:");
		zeilen =in.nextInt();
		System.out.println();
		
		System.out.print("     ");
		
		for (int i=0; i<spalten; i++) {
			System.out.print((i+1) + " | ");
		}
		
		System.out.println("");
		System.out.print("----");
		
		for (int i=0; i<spalten; i++) {
			System.out.print("----");
		}
		
		
		for (int i=0; i<zeilen; i++) {
			
			System.out.println();
			System.out.print((i+1) + "  |");
			
			for (int j=0; j<spalten; j++) {
				
				System.out.print( " " + ((i+1)*(j+1)) + " |");
				
			}
		} 
		in.close();
	}
}