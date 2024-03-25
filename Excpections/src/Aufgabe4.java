
public class Aufgabe4 {
	
	public static void dividierefuermich(int z, int t) throws ArithmeticException{

		 System.out.println(z/t); //hier könnte ein Fehler bei Division mit Null auftreten
	}
	
	public static void main(String[] args) {
		 int zahl, teiler, ergebnis=0;

		 try {
		 zahl=10;
		 teiler=0;
		 dividierefuermich(zahl,teiler);
		 }
		 catch(ArithmeticException a){
		 System.out.println("Fehler! bei der Division - überprüfen Sie die Zulässigkeit Ihrer Zahlen");
		 System.out.println(a.getMessage());
		 }
	}
}
