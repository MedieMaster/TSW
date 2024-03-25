
public class PersonalMain {

	public static void main(String[] args) {
		
		MitarbeiterListe liste = new MitarbeiterListe();
		PersonalGUI gui = new PersonalGUI(liste);
		
		for(int i=0; i < 20; i++) {
			Mitarbeiter m = new Mitarbeiter(i, "Nicolas", "Detering", "Steinstrasse", "Entwicklung", 18);
			liste.add(m);
		}

		gui.start();
		
	}

}
