package Aufgabe1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gay {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Are you Gay");
		JButton yes = new JButton("Yes");
		JButton no = new JButton("No");
		JLabel label = new JLabel("Are you Gay?");
		frame.setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE );
		frame.setLayout(null);
		frame.setVisible(true);
		
		frame.setSize(500, 800);
		
		frame.add(label);
		label.setVisible(true);
		label.setLocation(150, 300);
		label.setSize(200, 50);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setBackground(Color.red);
		
		yes.setLocation(100, 400);
		yes.setSize(70, 30);
		frame.add(yes);
		yes.setVisible(true);
		
		
		no.setLocation(200, 400);
		no.setSize(70, 30);
		frame.add(no);
		no.setVisible(true);
		
		yes.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				no.setVisible(false);
				yes.setVisible(false);
				
				label.setText("Knew it");
				
			}
			
		});
		
		no.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				Random ran = new Random();
				
				no.setLocation(ran.nextInt(480), ran.nextInt(780));
				
			}
			
		});
		
	}

}
