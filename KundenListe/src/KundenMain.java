
public class KundenMain {
	
	public static void main(String[] args) {
		
		KundenListe liste = new KundenListe();
		KundenGUI kunden = new KundenGUI(liste);
		
		for(int i=0; i<20; i++) {
			Kunden kunde = new Kunden(i, "hihi", "haha", "hoho");
			liste.add(kunde);
		}
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
		Kunden kunde = new Kunden(20, "Robin", "Haasler", "Musterstraße");
		liste.add(kunde);
		
		kunden.start();
	
	}

}
