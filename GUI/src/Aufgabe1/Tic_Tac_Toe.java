package Aufgabe1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Tic_Tac_Toe {

	JFrame window;
	JPanel playGround;
	JButton[][] buttons;
	JLabel playerInformation;
	String sign;
	int[][] combinations = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 },
			{ 1, 5, 9 }, { 3, 5, 7 } };
	int x = 0;
	int y = 0;
	String gay = "";
	boolean end = false;
	
	JFrame window2;
	JLabel spielerO;
	JLabel spielerX;
	JTextField spielerBoxO;
	JTextField spielerBoxX;
	JButton start;
	JLabel stat;
	JLabel siegeX;
	JLabel siegeO;
	JLabel unentschieden;

	public boolean gameOver() {
		// 1-1%3 = x
		// 0/3 = y

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 3; j++) {
				x = (combinations[i][j] - 1) % 3;
				y = (combinations[i][j] - 1) / 3;
				gay += buttons[y][x].getText();
			}
			if (gay.equals("XXX") || gay.equals("OOO")) {
				end = true;
				System.out.println("winner");
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 3; k++) {
						buttons[j][k].setEnabled(false);
						playerInformation.setText("Spieler " + gay.charAt(0) + " hat gewonnen");
					}
				}
			} else {
				gay = "";
				playerInformation.setText("Unentschieden");
			}
		}
		return end;

	}
	
	public static void PlayerWindow() {
		
	}

	public Tic_Tac_Toe() {
		window2 = new JFrame("PlayerInfo");
		window2.setSize(300, 600);
		window2.setLayout(new GridBagLayout());
		window2.setResizable(true);
		window2.setDefaultCloseOperation(window2.EXIT_ON_CLOSE);
		
		spielerO = new JLabel();
		spielerX = new JLabel();
		spielerBoxO = new JTextField();
		spielerBoxX = new JTextField();
		start = new JButton();
		stat = new JLabel();
		siegeX = new JLabel();
		siegeO = new JLabel();
		unentschieden = new JLabel();
		
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		window2.add(spielerO, c);
		c.gridx = 5;
		window2.add(spielerBoxX, c);
		c.gridx = 0;
		c.gridy = 1;
		window2.add(spielerX, c);
		c.gridx = 5;
		window2.add(spielerBoxX, c);
		c.gridx = 2;
		c.gridy = 2;
		window2.add(start, c);
		c.gridy = 3;
		window2.add(stat, c);
		c.gridx = 0;
		c.gridy = 4;
		window2.add(siegeX, c);
		c.gridx = 2;
		window2.add(siegeO, c);
		c.gridx = 4;
		window2.add(unentschieden, c);
		
		
		
		
		
		window = new JFrame("TIC-TAC-TOE");
		window.setSize(400, 430);
		window.setResizable(false);
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		window.setLayout(new BorderLayout());
		playGround = new JPanel();
		playGround.setLayout(new GridLayout(3, 3));
		buttons = new JButton[3][3];
		playerInformation = new JLabel("Spieler X ist am Zug!", JLabel.CENTER);
		playerInformation.setPreferredSize(new Dimension(400, 30));
		Font font = new Font("Arial", Font.BOLD, 100);

		sign = new String("X");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				JButton button = new JButton();
				buttons[i][j] = button;
				playGround.add(button);

				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						button.setEnabled(false);
						button.setFont(font);
						button.setBackground(Color.white);
						if (sign.equalsIgnoreCase("X")) {
							button.setText("X");
							sign = "O";
							playerInformation.setText("Spieler O ist am Zug!");
						} else {
							button.setText("O");
							sign = "X";
							playerInformation.setText("Spieler X ist am Zug!");
						}
						gameOver();
					}

				});

			}
		}
		window.add(playGround, BorderLayout.CENTER);
		window.add(playerInformation, BorderLayout.PAGE_END);
		window.setVisible(true);
		
		window2.setVisible(true);

	}

	public static void main(String[] args) {
		Tic_Tac_Toe ttt = new Tic_Tac_Toe();

	}

}
