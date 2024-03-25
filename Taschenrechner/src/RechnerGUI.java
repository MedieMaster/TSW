import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RechnerGUI {
	
	private Rechner rechner;
	private char operation;
	
	JFrame rechnerf;
	JLabel ope;
	JLabel erg;
	JLabel Rechenop;
	JLabel summe;
	JLabel sum;
	JButton gleich;
	JButton plus;
	JButton minus;
	JButton mal;
	JButton geteilt;
	JButton pot;
	JButton root;
	JButton mod;
	JTextField f1;
	JTextField f2;
	JPanel p1;
	JPanel p2;
	JPanel p3;
	double zahl1;
	double zahl2;
	
	public RechnerGUI(Rechner rech) {
		rechner = rech;
		
		rechnerf = new JFrame("Taschenrechner");
		ope = new JLabel("+");
		erg = new JLabel();
		Rechenop = new JLabel("Rechenoperant: ");
		summe = new JLabel("Gesamtsumme: ");
		sum = new JLabel("0");
		gleich = new JButton("=");
		plus = new JButton("+");
		minus = new JButton("-");
		mal = new JButton("*");
		geteilt = new JButton("/");
		pot = new JButton("^");
		root = new JButton("√");
		mod = new JButton("%");
		f1 = new JTextField(10);
		f2 = new JTextField(10);
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		zahl1 = 0;
		zahl2 = 0;
		operation = '+';
	}
	public void start() {
		
		rechnerf.setSize(800, 300);
		rechnerf.setLayout(new GridLayout(3, 1));
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		p3.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ope.setText("+");
				operation = '+';
			}
		});
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ope.setText("-");
				operation = '-';
			}
		});
		mal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ope.setText("*");
				operation = '*';
			}
		});
		geteilt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ope.setText("/");
				operation = '/';
			}
		});
		pot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ope.setText("^");
				operation = '^';
			}
		});
		root.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ope.setText("√");
				operation = '√';
			}
		});
		mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ope.setText("%");
				operation = '%';
			}
		});
		
		gleich.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					zahl1 = Double.parseDouble(f1.getText());
					zahl2 = Double.parseDouble(f2.getText());
					
					switch(operation) {
					case '+':
						erg.setText(String.valueOf(rechner.add(zahl1, zahl2)));
					break;
					case '-':
						erg.setText(String.valueOf(rechner.sub(zahl1, zahl2)));
					break;
					case '*':
						erg.setText(String.valueOf(rechner.mult(zahl1, zahl2)));
					break;
					case '/':
						erg.setText(String.valueOf(rechner.div(zahl1, zahl2)));
					break;
					case '^':
						erg.setText(String.valueOf(rechner.pot(zahl1, zahl2)));
					break;
					case '√':
						erg.setText(String.valueOf(rechner.root(zahl1, zahl2)));
					break;
					case '%':
						erg.setText(String.valueOf(rechner.mod(zahl1, zahl2)));
					break;
						
				}
				}catch(NumberFormatException ef) {
					erg.setText("Fehler");
					
				}
				

				
				sum.setText(String.valueOf(rechner.getSumme()));
				
			}
		});
		
		p1.add(f1);
		p1.add(ope);
		p1.add(f2);
		p1.add(gleich);
		p1.add(erg);
		
		p2.add(Rechenop);
		p2.add(plus);
		p2.add(minus);
		p2.add(mal);
		p2.add(geteilt);
		p2.add(pot);
		p2.add(root);
		p2.add(mod);
		
		p3.add(summe);
		p3.add(sum);
		
		rechnerf.add(p1);
		rechnerf.add(p2);
		rechnerf.add(p3);
		
		rechnerf.setVisible(true);
	}
	
	
}
