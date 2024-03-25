import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Framejr {

	JFrame frame;
	JButton pressed;
	private createDoku doku = new createDoku();
	int[][] loesung;
	private int buttx;
	private int butty;
	private JButton[][] buttgrid;
	Random ran = new Random();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JButton clear = new JButton("Clear");
	int count=0;
	SudokuGUI gui = new SudokuGUI();
	
	public Framejr(JButton[][] buttgrid) {
		loesung = doku.create();
		frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.setSize(150, 185);
		p1.setLayout(new GridLayout(3, 3, 2, 2));
		buttons();
		this.buttgrid = buttgrid;
		frame.add(p1, BorderLayout.CENTER);
		p1.setBackground(Color.black);
		clear.setBackground(Color.LIGHT_GRAY);
		clear.addActionListener(e -> {
			pressed.setText("");
			frame.setVisible(false);
		});
		p2.add(clear);
		frame.add(p2, BorderLayout.PAGE_END);
	}
	
	public void showFrame(int x, int y, JButton b, int bx, int by) {
		frame.setLocation(x, y);
		frame.setVisible(true);
		pressed = b;
		buttx = bx;
		butty = by;
	}
	
	public void buttons() {
		JButton[][] butt = new JButton[3][3];
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				butt[j][i] = new JButton();
				butt[j][i].setText(String.valueOf(i*3+j+1));
				butt[j][i].setBackground(Color.LIGHT_GRAY);
				p1.add(butt[j][i]);
				JButton b = butt[j][i];
				butt[j][i].addActionListener(e -> {
					int l = loesung[buttx][butty];
					System.out.print(l);
						pressed.setText(b.getText());
						frame.setVisible(false);
						if(pressed.getText().length() != 0) {
							if(l == Integer.parseInt(pressed.getText())) {
								pressed.setForeground(Color.black);
								count++;
								if(count == 88) {
									gui.endScreen();
								}
							}
							else {
								pressed.setForeground(Color.red);
							}
						}
					
					
				});
			}
		}
	}
	
	public void showbutton() {
		
		for(int i=0; i<36; i++) {
			int x = ran.nextInt(9);
			int y = ran.nextInt(9);
			
			buttgrid[x][y].setText(String.valueOf(loesung[x][y]));
			count++;
		}
		
	}
	
	public void tip() {
		
		List<Integer> freeFields = new ArrayList<Integer>();
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				
				if(buttgrid[j][i].getText().equalsIgnoreCase("")) {
					freeFields.add(i*9+j);
				}
			}
		}
		
		if(!freeFields.isEmpty()) {
			int gay = ran.nextInt(freeFields.size());
			int bi = freeFields.get(gay);
			int x = bi%9;
			int y = bi/9;
			
			buttgrid[x][y].setText(String.valueOf(loesung[x][y]));
			count++;
			if(count == 88) {
				gui.endScreen();
			}
		}	
	}
}