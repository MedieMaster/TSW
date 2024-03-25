
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FahrzeugGUI {
	
	public void start() {
		
		Fahrzeug f1 = new Fahrzeug(1, 1);
		PKW p1 = new PKW(2, 2, 2, 2);
		ElektroPKW ep1 = new ElektroPKW(3, 3, 3, 3, 3);
		VerbrennerPKW vp1 = new VerbrennerPKW(4, 4, 4, 4, 4);
		LKW l1 = new LKW(5, 5, 5, 5, 5);
		Motorroller m1 = new Motorroller(6, 6);
		Elektroroller em1 = new Elektroroller(7, 7, 7);
		Benzinroller bm1 = new Benzinroller(8, 8);
		
		List<Fahrzeug> liste = new ArrayList<Fahrzeug>();
		liste.add(f1);
		liste.add(p1);
		liste.add(ep1);
		liste.add(vp1);
		liste.add(l1);
		liste.add(m1);
		liste.add(em1);
		liste.add(bm1);
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(new GridLayout(2, 1));
		JTextArea area51 = new JTextArea();
		JTextArea area52 = new JTextArea();
		
		frame.setSize(450, 600);
		
		for(int i=0; i<8; i++) {
			if(liste.get(i) instanceof Motorroller || liste.get(i) instanceof LKW || liste.get(i) instanceof PKW) {
				area52.append(liste.get(i).toString() + "\n");
			}
			else {
				area51.append(liste.get(i).toString() + "\n");
			}
		}
		
		panel.add(area51);
		panel.add(area52);
		frame.add(panel);
		frame.setVisible(true);
	}
}
