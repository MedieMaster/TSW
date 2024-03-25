package Aufgabe1;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Station2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		JFrame frame = new JFrame("K");
		frame.setVisible(true);
		frame.setSize(800, 800);
		frame.setLocation(50, 50);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		JLabel label = new JLabel("Gay");
		frame.add(label, SwingConstants.CENTER);
		
		Color color = new Color(0, 0, 0);
		label.setOpaque(true);
		label.setBackground(Color.GREEN);
		
		Color[] farbliste = new Color[] {Color.red, Color.black, Color.green, Color.blue, Color.cyan, Color.darkGray, Color.gray, Color.magenta, Color.pink };
		label.setHorizontalAlignment(JLabel.CENTER);
		
		do {
			
			Random ran = new Random();
			
			for(int i=10; i<=50; i++) {
				Font f = new Font("Orion Esperanto", Font.PLAIN, i);
				label.setFont(f);
				label.setBackground(farbliste[ran.nextInt(9)]);
				Thread.sleep(100);
			}
			
			for(int i=50; i>=10; i--) {
				Font f = new Font("Orion Esperanto", Font.PLAIN, i);
				label.setFont(f);
				label.setBackground(farbliste[ran.nextInt(9)]);
				Thread.sleep(100);
			}
			
		}while(1 == 1);
		
	}

}
