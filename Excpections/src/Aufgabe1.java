
public class Aufgabe1 {

	public static void main(String[] args) {
		
		
		
		 int[] ergebnis = {0, 0, 0};
		 int[] teiler = {3, 2, 1};

		 try {
			 int zahl=10;
			 for (int i=0; i<teiler.length; i++) {
				 ergebnis[i] = zahl / teiler[i];
				 System.out.println("Kein Fehler im Durchlauf: "+i);
			}

			 System.out.println("Meine Ergebnisse: ");
			 for (int i=0; i<teiler.length; i++) {
				 System.out.println(ergebnis[i]+" ");
			 }

			 int index=3;
			 System.out.println("Das letzte Ergebnis"+ergebnis[index]);
		 }catch(ArithmeticException a){
		 System.out.println("Fehler! bei der Division");
		 //System.out.println(a.getMessage());  alternativ
		 //a.printStackTrace();
		 }catch(ArrayIndexOutOfBoundsException ai){
			 System.out.println("Fehler! beim Zugriff auf das Ergebnis-Array");
			 //System.out.println(ai.getMessage());
			 //a
	 	}

	}
}
