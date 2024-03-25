import java.util.LinkedList;

public class KundenListe {
	
	private LinkedList<Kunden> liste;
	
	public KundenListe() {
		liste = new LinkedList<Kunden>();
	}

	public Kunden suchen(int kdNr) {
		
		for(int i=0; i<liste.size(); i++) {
			if(liste.get(i).getKdNr() == kdNr) {
				return liste.get(i);
			}
		}
		return null;
		
	}
	
	public Kunden suchen(String nachname) {
		
		for(int i=0; i<liste.size(); i++) {
			if(liste.get(i).getNachname().equalsIgnoreCase(nachname)) {
				return liste.get(i);
			}
		}
		return null;
		
	}
	
	public LinkedList<Kunden> suchenGesamt(String namensteil) {
		
		LinkedList<Kunden> k = new LinkedList<Kunden>();
		
		for(int i=0; i<liste.size(); i++) {
			if(liste.get(i).getNachname().toLowerCase().contains(namensteil.toLowerCase())) {
				k.add(liste.get(i));
				
			}
		}
		
		return k;
	}
	
	public LinkedList<Kunden> suchen(String namensteil, int id){
		
		LinkedList<Kunden> k = new LinkedList<Kunden>();
		
		if(namensteil.equals(null) && id == -1) {
			
			k = null;
			
		}
		
		if(namensteil.equals(null)) {
			
		}
		
		return null;
	}
	
	
	public void add(Kunden kunde) {
		
		liste.add(kunde);
		
	}
	
}
