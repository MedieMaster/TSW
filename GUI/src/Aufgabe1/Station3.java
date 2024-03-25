package Aufgabe1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Station3 {

	public static void main(String[] args) {
		
		Color color = new Color(0, 0, 0);
		
//		FlowLayout layout = new FlowLayout();
		GridLayout grid = new GridLayout(3, 2);
		GridLayout grid2 = new GridLayout(3, 3);
		Border b = BorderFactory.createLineBorder(Color.BLACK, 1);
		
//		grid.setRows(2);
//		grid.setColumns(2);
//		BorderLayout border = new BorderLayout();
		
		JFrame frame = new JFrame("K");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setLocation(50, 50);
		
//		frame.setLayout(border);
//		
//		JLabel label = new JLabel("Oben");
//		frame.add(label, BorderLayout.PAGE_START);
//		label.setBorder(b);
//		JLabel label2 = new JLabel("Links");
//		frame.add(label2, BorderLayout.LINE_START);
//		label2.setBorder(b);
//		JLabel label3 = new JLabel("Mitte");
//		frame.add(label3, BorderLayout.CENTER);
//		label3.setBorder(b);
//		JLabel label4 = new JLabel("Rechts");
//		frame.add(label4, BorderLayout.LINE_END);
//		label4.setBorder(b);
//		JLabel label5 = new JLabel("Unten");
//		frame.add(label5, BorderLayout.PAGE_END);
//		label5.setBorder(b);
		
		JLabel label1 = new JLabel("A");
		label1.setHorizontalAlignment(JLabel.CENTER);
		JLabel label2 = new JLabel("B");
		label2.setHorizontalAlignment(JLabel.CENTER);
		JLabel label3 = new JLabel("C");
		label3.setHorizontalAlignment(JLabel.CENTER);
		JLabel label4 = new JLabel("D");
		label4.setHorizontalAlignment(JLabel.CENTER);
		JLabel label5 = new JLabel("E");
		label5.setHorizontalAlignment(JLabel.CENTER);
		
		label1.setBorder(b);
		label2.setBorder(b);
		label3.setBorder(b);
		label4.setBorder(b);
		label5.setBorder(b);
		
		JPanel panel = new JPanel();
		panel.setBorder(b);
		panel.setVisible(true);
		
		
		frame.setLayout(grid);
		frame.add(label1);
		frame.add(panel);
		panel.setLayout(grid2);
		
		for(int i=1; i<=9; i++) {
			JLabel label = new JLabel(""+i);
			panel.add(label);
			label.setHorizontalAlignment(JLabel.CENTER);
		}
		
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		
	}
	
}
