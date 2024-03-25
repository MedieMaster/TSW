public class RechnerMain {
	
	public static void main(String[] args) {
		Rechner rechner = new Rechner();
		RechnerGUI r = new RechnerGUI(rechner);
		
		r.start();
	}
	
}
