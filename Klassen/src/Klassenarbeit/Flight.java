package Klassenarbeit;

public class Flight {
	
	private String destination;
	private int number, occupaied;
	private double price;
	// ----------------- Attribute: 3/3
	
	public Flight(String destination, int number, int occupaied, double price) {
		this.destination=destination;
		this.number=number;
		this.occupaied=occupaied;
		this.price=price;
	}

	public String getDestination() {
		return destination;
	}

	public int getNumber() {
		return number;
	}

	public int getOccupaied() {
		return occupaied;
	}

	public double getPrice() {
		return price;
	}
	//----------------- Parameterkonstruktor + Getter: 7/7	
	
	public double addreservation(int quantity) {
		double price_new=0;
		
		if(number>=quantity+occupaied) {
			price_new = (double)quantity*price;
			occupaied=occupaied+quantity;
		}
		else {
			price_new=1000;  //und was ist, wenn der errechnete Preis zufällig 1000€ beträgt - Abbruch bei 0 wäre sinnvoller (-0,5)
			//# Meldung durch Methode (-1)
		}
		return price_new;
	}
	//------------------ addReservation: 9,5/11
	
	public double utilisation() {
		return ((double)number/100)*(double)occupaied;  //Formelfehler (-1)
	}
	//--------------- utilisation:  3/4

}
