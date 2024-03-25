
public class Aufgabe5 {
	
	public static void dividierefuermich(int z, int t) {

		if (t == 0)
			throw new IllegalArgumentException("Mit sowas dividiere ich nicht!");
		else
			System.out.println(z/t);
		}
	
	public static void main(String[] args) {
		int zahl, teiler, ergebnis=0;

		try {
			zahl=10;
			teiler=0;
			dividierefuermich(zahl,teiler);
		}
		catch(IllegalArgumentException a){
			 System.out.println("Fehler! bei der Division - überprüfen Sie die Zulässigkeit Ihrer Zahlen");  System.out.println(a.getMessage());
		#}
	} 

}
