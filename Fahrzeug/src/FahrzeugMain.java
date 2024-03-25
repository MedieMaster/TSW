
public class FahrzeugMain {

	public static void main(String[] args) {
		
		Fahrzeug f = new Fahrzeug(4, 69);
		Motorroller m = new Motorroller(0, 0);
		Fahrzeug e = new Elektroroller(0, 0, 0);
		LKW l = new LKW(1,1,1,1,1);
		FahrzeugGUI gui = new FahrzeugGUI();
		
		
		/*e = (Motorroller)f;
		
		f = m;
		f.test();
		
		System.out.println(f.test);
		System.out.println(m.test);
		
		f = m;
		
		System.out.println(f.test);
		
		System.out.println(l);*/
		
		gui.start();
	}

}
