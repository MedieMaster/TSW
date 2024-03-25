package Aufgabe1;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Station4 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Button");
		frame.setSize(600, 600);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(50, 50);
		
		frame.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JLabel label = new JLabel("Sind Sie Gay");
		frame.add(label);
		label.setOpaque(true);
		//label.setBackground(Color.GREEN);
		
		c.gridx = 1;
		c.gridy = 0;
		frame.add(label, c);
		JPanel panel = new JPanel();
		panel.setSize(400, 200);
		JButton button1 = new JButton("Ja");
		panel.add(button1);
		
		JButton button2 = new JButton("Nein");
		panel.add(button2);
		frame.add(panel);
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				button1.setVisible(false);
//				button2.setVisible(false);
//				label.setText("Knew it");
//				System.out.println("Button ja wurde geklickt");
				button1.setEnabled(false);
				button2.setEnabled(false);
				label.setBackground(Color.GREEN);
				label.setText("Sie haben Button ja gedrückt");
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				button1.setVisible(false);
//				button2.setVisible(false);
//				label.setText("Lüge");
//				System.out.println("Button nein wurde geklickt");
				button1.setEnabled(false);
				button2.setEnabled(false);
				label.setBackground(Color.RED);
				label.setText("Sie haben Button nein gedrückt");
			}
		});
		
		
		c.gridx = 1;
		c.gridy = 1;
		frame.add(panel, c);		
	}

}
