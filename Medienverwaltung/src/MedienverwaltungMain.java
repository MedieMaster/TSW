
public class MedienverwaltungMain {
	
	public static void main(String[] args) {
		
		Medienverwaltung mv = new Medienverwaltung();
		MedienGUI gui = new MedienGUI(mv);
		
		gui.start();
		
	}
}