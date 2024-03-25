import java.util.Random; // Nicolas Gruppe B Nr. I-22
import java.util.Scanner;

public class Nicolas_1 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		Random ran = new Random();
		int versuche=0, raten=0, summe=0, gerade=0, min=1, max=6;
		int ausw;   //falscher Datentyp (-1) zu A4
		
		
		System.out.println("****************************");
		System.out.println("* Würfel Mensch - Maschine *");
		System.out.println("**************************** \n");
	//-------------------------------- A1: 2/2 
		
		do {
			System.out.print("Wie oft darf ich würfeln? ");
			versuche = in.nextInt();
			//----------------------------- A2: 5/5
			
			int[] zahlen = new int[versuche];
			
			for (int i=0; i<versuche; i++) {
				zahlen[i] = (int) Math.random(max-min+1)+min;   //f random hat keine Parameter  * max-min+1 muss nach hinten  (-1)
			}
			//---------------------------- A3: 8/9
			
			System.out.println("\n ");
			System.out.println("**************************** \n");
			System.out.println("Fertig! Was willst Du nun erraten?");
			System.out.println("(A/a) - Summe der Augen");
			System.out.println("(G/g) - Anzahl der geraden Zahlen");
			System.out.print("Wähle jetzt: ");
			ausw = in.nextInt();   //Methode zur Eingabe char fehlt (-1)
			
			//-------------------------- A4: 3/5
			
			System.out.println("Nun rate mal: ");
			raten = in.nextInt();
			// es fehlt summe=0, gerade=0   (-1)
			
			if (ausw == '1' || ausw == 'a') {   //f(-1)
				
				for (int i=0; i<versuche; i++) {
					summe+=zahlen[i];
				}
				
				if (summe == raten) {
					System.out.println("richtig!! \n");
				}
				
				else {
					System.out.println("falsch!! \n");
				}
	
			}
			
			else if (ausw == 'G' || ausw == 'g') {
				for (int i=0; i<versuche; i++) {
					if ((zahlen[i]%2) == 0) {
						gerade++;
					}
				}
				
				if (gerade == raten) {
					System.out.println("richtig!! \n");
				}
				else {
					System.out.println("falsch!! \n");					//Dopplung im Quelltext
				}
			}
			//-------------------------------- A5: 15/17
			
			System.out.print("Überprüfe selbst - das sind meine gewürfelten Zahlen: ");
			
			for (int i=0; i<versuche; i++) {
				
				System.out.print(zahlen[i]);
			}
			//------------------------------- A6: 2/2
			
			System.out.print("Willst Du noch ein Spiel (1) oder (2)?");
			ausw = in.nextInt();    //Wdh falscher Datentyp
		} while(ausw == 1);	   //#(-1)
		//----------------------------------- A7: 3/4
	}


}
//---------------------------- Programm:  38/44	
//-----------------------------  s/l:      2/3

//---- 40/47  --  85,11%  -->  Note: 2+
