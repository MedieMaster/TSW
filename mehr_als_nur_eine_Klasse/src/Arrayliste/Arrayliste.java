package Arrayliste;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrayliste {

	public static void main(String[] args) {
		String[] test = new String[3];
		ArrayList<String> test2 = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		String name = new String();
		int jam=0, i=0;
		
		do {
			
			name = in.next();
			test2.add(name);
			System.out.println("Wollen Sie noch einen Namen eingeben");
			jam = in.nextInt();
		}while(jam == 1);
		
		System.out.println(test2.size());
	}

}
