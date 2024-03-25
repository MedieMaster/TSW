import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SudokuGUI {
	
	JFrame frame = new JFrame("Sudoku");
	private JButton[][] bgrid = new JButton[9][9];
	private Framejr framejr;
	private JButton tip = new JButton("Tip");
	private JButton newGame = new JButton("Neues Spiel");
	private JPanel[] pgrid = new JPanel[9];
	private Box mainPanel = new Box(BoxLayout.Y_AXIS);
	private int[][] loesung = new int[9][9];
	private Timer timer = new Timer();
	private JLabel time = new JLabel();
	private int sec;
	JPanel panel = new JPanel(new GridLayout(3, 3, 4, 4));
	JPanel menu = new JPanel();
	TimerTask tt;
	JButton b1 = new JButton("Neues Spiel");;
	
	public void init() {
		
		Font font = new Font("Arial", Font.PLAIN, 29);
		
		for(int i=0; i<9; i++) {
			pgrid[i] = new JPanel(new GridLayout(3,3, 2, 2));
			pgrid[i].setOpaque(false);
			for(int j=0; j<9; j++) {
				bgrid[j][i] = new JButton();
				bgrid[j][i].setBackground(Color.LIGHT_GRAY);
				bgrid[j][i].setFont(font);
				bgrid[j][i].setForeground(Color.black);
			}
		}
		
		tip.setBackground(Color.LIGHT_GRAY);
		newGame.setBackground(Color.LIGHT_GRAY);
		
		frame.setSize(612, 750);
		
		panel.setSize(600, 600);
		panel.setBackground(Color.black);
		
		
		menu.setSize(612, 150);
		
		tip.addActionListener(e -> {
			framejr.tip();
			
		});
		
		newGame.addActionListener(e ->{
			
			restart();
			
		});
		
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		b1.addActionListener(e -> {
			
			restart();
			
		});
		
		start();
	}
	
	public void start() {
		
		timer();
		
		framejr = new Framejr(bgrid);
		framejr.showbutton();
		
		for(int i=0; i<9; i++) {
			panel.add(pgrid[i]);
			for(int j=0; j<9; j++) {
				int pindex = (i/3) * 3 + (j/3);
				JButton b = bgrid[j][i];
				if(pindex%2 == 1) {
					b.setBackground(Color.white);
				}
				pgrid[pindex].add(b);
				final int fi = i;
				final int fj = j;
				loesung = framejr.loesung;
				
				bgrid[j][i].addActionListener(e -> {
					if(b.getText().equalsIgnoreCase(String.valueOf(loesung[fj][fi]))) {
						
					}
					else {
						PointerInfo m = MouseInfo.getPointerInfo();
						framejr.showFrame((int)m.getLocation().getX(), (int)m.getLocation().getY(), b, fj, fi);
					}
				});
				
				
			}
		}
		
		menu.add(tip);
		menu.add(newGame);
		menu.add(time);
		mainPanel.add(panel);
		mainPanel.add(menu);
		frame.add(mainPanel);
		frame.setVisible(true);
		
	}
	
	public void restart() {
		
		tt.cancel();
		framejr.count = 0;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				bgrid[j][i].setText("");
			}
		}
		
		start();
		
	}
	
	public void timer() {
		
		long ms = System.currentTimeMillis();
		
				
		tt = new TimerTask() {

			@Override
			public void run() {
				
				sec = (int) ((System.currentTimeMillis() - ms) / 1000);
				int s = sec%60;
				int m = sec/60;
				if(m < 10) {
					time.setText("0" + m + ":" + s);
				}
				if(s < 10) {
					time.setText(m + ":0" + s);
				}
				if(s < 10 && m < 10) {
					time.setText("0" + m + ":0" + s);
				}
				
			}
			
		};
		
		timer.schedule(tt, 0, 1000);
		
	}
	
	public void endScreen() {
		
		
		System.out.print("test");
		String z = time.getText();
		
		frame.setVisible(false);
		
		JFrame end = new JFrame();
		end.setLayout(new GridLayout(2, 1));
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JLabel l1 = new JLabel("Sie haben Gewonnen");
		JLabel timelabel = new JLabel(z);
		
		
		
		
		end.setSize(300, 200);
		
		p1.add(l1);
		p2.add(timelabel);
		p2.add(b1);
		end.add(p1);
		end.add(p2);
		
		end.setVisible(true);
		
	}
	
}
