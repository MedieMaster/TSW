import java.util.LinkedList;

public class MitarbeiterListe {

	LinkedList<Mitarbeiter> liste;
	
	public MitarbeiterListe() {
		
		liste = new LinkedList<Mitarbeiter>();
		
	}
	
	public LinkedList<Mitarbeiter> suchen(String bereich, int alterVon, int alterBis) {
		
		LinkedList<Mitarbeiter> list = new LinkedList<Mitarbeiter>();
		
		for(Mitarbeiter m : liste) {
			
			if(bereich.equalsIgnoreCase(m.getBereich())) {
				
				if(alterVon <= m.getAlter() && alterBis >= m.getAlter()) {
					
					list.add(m);
					
				}
				
			}
			
		}
		
		return list;
		
	}
	
	public void add(Mitarbeiter mitarbeiter) {
		
		liste.add(mitarbeiter);
		
	}
	
}
