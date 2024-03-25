package Aufgabe1;

import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;

public class Station1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Anlegen eines neuen Fensters
		JFrame frame = new JFrame( "Mein erstes Fenster" );
		frame.setSize(400, 300);
		// Fenster sind grunsaetzlich nicht automatisch sichtbar.
		frame.setVisible( true );
		// Was soll passieren, wenn auf das rote X geklickt wird? => 
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
//		do {
//			
//			Date d = new Date();
//			
//			frame.setTitle(d.toString());
//			Thread.sleep( 1000 ); 
//			
//			
//		}while(1 == 1);
		
//		do {
//			
//			int size = 5;
//			
//			frame.setSize(400+size, 300);
//			Thread.sleep( 1000 ); 
//			frame.setSize(400-size, 300);
//			
//			
//		}while(1 == 1);
		
//		do {
//			
//			Random ran = new Random();
//			
//			frame.setLocation(ran.nextInt(1919), ran.nextInt(1079));
//			Thread.sleep( 1000 );
//			
//		}while(1 == 1);
		
		
	}

}
