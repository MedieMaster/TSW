import java.util.Scanner;

public class Aufgabe3 {
	
	public static void main(String[] args) {
		
		double a, b;
		String name;
		Scanner in = new Scanner(System.in);
		
		
		
		System.out.println("*******************");
		System.out.println("MINI-TASCHENRECHNER");
		System.out.println("*******************");
		System.out.println();
		
		System.out.print("Geben Sie die 1. Zahl ein: ");
		a =in.nextInt();
		System.out.print("... und nun die 2. zahl: ");
		b =in.nextInt();
		
		System.out.println("Hier kommen Ihre Ergebnisse");
		System.out.println("***************************");
		System.out.println("|  " + a + "+" + b + "=" + (a+b));
		System.out.println("|  " + a + "-" + b + "=" + (a-b));
		System.out.println("|  " + a + "*" + b + "=" + (a*b));
		System.out.println("|  " + a + "/" + b + "=" + (a/b));
		double p = Math.pow(a, b);
		System.out.print("|  " + a + "^" + b + "=");
		System.out.println(p);
		System.out.println("***************************");
		
		System.out.println("Bitte geben Sie Ihren Namen ein.");
		in.nextLine();
		name =in.nextLine();
		System.out.println(name + ", Dein erstes JAVA-Programm funktioniert");
		
		in.close();
	}
	
}
