package Arbeit;
public class Test_nicolas {

	public static void main(String[] args) {
		
		Mensa_nicolas m1 = new Mensa_nicolas("Luettfeld", 5);
		//Objekt m:  2/2
		
		Speise_nicolas s1;
		Speise_nicolas s2;
		try {
			s1 = new Speise_nicolas("Schnitzel mit Pommes", 450, 1);
			if(m1.addSpeise(s1)) {   //Objektname nutzen (-1)
				System.out.println("Speise " + s1 + " steht nun auf der Speisekarte.");
			}
		}catch(IllegalArgumentException ia){
			ia.getMessage();
		}
		//Objekt s:  11/12
		try {
			s2 = new Speise_nicolas("Curry mit jasminreis", 280, 3);
			if(m1.addSpeise(s2)) {   //Wdh.fehler
				System.out.println("Speise " + s2 + " steht nun auf der Speisekarte.");
			}
		}catch(IllegalArgumentException ia){
			ia.getMessage();
		}
		
		System.out.println(m1.evaluation());
		//Wiederholung Objekt s:  3/3
		
		//Aufruf evaluation: 0/1
	}

}
//class Test:  16/18

//s/l:   3,5/4

//-------------------------------------------
//Summe:  54,5/68   -   80,15%   -  Note: 2
