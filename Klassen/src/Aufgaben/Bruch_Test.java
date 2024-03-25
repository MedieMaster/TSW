package Aufgaben;

import java.util.Scanner;

public class Bruch_Test {

	public static void main(String[] args) {
		Bruch b1 = new Bruch();
		Bruch b2 = new Bruch();
		Bruch b3 = new Bruch();
		
		try {
			b1 = new Bruch(1, 0);
			b2 = new Bruch(1, 20);
			b3 = new Bruch(1, 1);
		}catch(IllegalArgumentException ia) {
			System.out.println(ia.getMessage());
		}
		
		String wahl = new String();
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("Wollen Sie eingene Brüche benutzten?");
			wahl = in.next();
			if (wahl.equalsIgnoreCase("J")) {
				boolean fehler;
				do {
					fehler=false;
					try {
						System.out.println("Geben Sie den 1. Zaehler ein");
						b1.setZaehler(in.nextInt());
						System.out.println("Geben Sie den 1. Nenner ein");
						b1.setNenner(in.nextInt());
						System.out.println("Geben Sie den 2. Zaehler ein");
						b2.setZaehler(in.nextInt());
						System.out.println("Geben Sie den 2. Nenner ein");
						b2.setNenner(in.nextInt());
					}catch(IllegalArgumentException ai) {
						System.out.println(ai.getMessage());
						fehler = true;
					}
				}while(fehler);
			}
		
			System.out.println("Wollen Sie addieren(+), subtrahieren(-), multiplizieren(*) oder dividieren(/)");
			wahl = in.next();
			
			switch (wahl) {
				
				case "+":
						b3 = b1.add(b2);
						System.out.println(b1 + " + " + b2 + " = " + b3);
					break;
					
				case "-":
						b3 = b1.sub(b2);
						System.out.println(b1 + " - " + b2 + " = " + b3);
					break;
				
				case "*":
						b3 = b1.multi(b2);
						System.out.println(b1 + " * " + b2	+ " = " + b3);
					break;
					
				case "/":
					try {
						b3 = b1.div(b2);
						System.out.println(b1 + " / " + b2	+ " = " + b3);
					}
					catch(IllegalArgumentException ia) {
						System.out.println(ia.getMessage());
					}
					
					break;
					
				default: 
					System.out.println("Fehler bei der Eingabe!");
						
					
			}
			System.out.println("Wollen Sie das Ergebnis in Dezimal haben?");
			wahl = in.next();
			if(wahl.equalsIgnoreCase("j")) {
				System.out.println(b3.komma());
			}
			
			System.out.println("Wollen Sie, dass Ergebnis kuerzen?");
			wahl = in.next();
			if(wahl.equalsIgnoreCase("j")) {
				System.out.println(b3.kuerzen(b3));
			}
			
			System.out.println("Wollen Sie noch mal rechnen?");
			wahl = in.next();
		
		}while(wahl.equalsIgnoreCase("j"));
		
		in.close();
	}

}
