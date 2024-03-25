import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KundenGUI {

	private KundenListe kundenliste;
	
	public KundenGUI(KundenListe kundenliste) {
		this.kundenliste = kundenliste;
	}
	
	public void start() {
		
		JFrame frame = new JFrame("Kundenliste");
		JLabel nr = new JLabel("KdNr");
		JLabel nachname = new JLabel("Nachname");
		JButton suchennr = new JButton("Suchen");
		JButton suchennn = new JButton("Suchen");
		JTextField tnr = new JTextField(10);
		JTextField tnn = new JTextField(20);
		JTextArea area = new JTextArea();
		JPanel mainp = new JPanel();
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel p2 = new JPanel(new BorderLayout());
		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel p4 = new JPanel(new BorderLayout());
		JPanel p5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JScrollPane scroll = new JScrollPane(area);
		
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		mainp.setLayout(new BoxLayout(mainp, BoxLayout.Y_AXIS));
		
		frame.setSize(500, 300);
		
		suchennr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					area.setText("");
					area.setText(kundenliste.suchen(Integer.parseInt(tnr.getText())).toString());
				}catch(NullPointerException np) {
					area.setText("Kein Kunde gefunden");
				}catch(NumberFormatException nf) {
					area.setText("Es werden nur Zahlen akzeptieren");
				}
				

			}
		});
		
		suchennn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*try {
					area.setText(kundenliste.suchen(tnn.getText()).toString());*/
					LinkedList<Kunden> k = kundenliste.suchenGesamt(tnn.getText());
					area.setText("");
					for(int i=0; i<k.size(); i++) {
						area.append(k.get(i).toString() + "\n");
					}
					
				/*}catch(NullPointerException np) {
					area.setText("Kein Kunde gefunden");
				}*/
				
				
			}
		});
		
		p1.add(nr);
		p2.add(tnr, BorderLayout.LINE_START);
		p2.add(suchennr, BorderLayout.LINE_END);
		p3.add(nachname);
		p4.add(tnn, BorderLayout.LINE_START);
		p4.add(suchennn, BorderLayout.LINE_END);
		p5.add(area);		
		
		
		mainp.add(p1);
		mainp.add(p2);
		mainp.add(p3);
		mainp.add(p4);
		mainp.add(p5);
		
		
		frame.add(mainp);
		
		frame.setVisible(true);
	}
	
}
