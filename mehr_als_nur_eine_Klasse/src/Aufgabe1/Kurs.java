package Aufgabe1;

import java.util.ArrayList;

public class Kurs {
	
	private ArrayList<Teilnehmer> teilnehmerliste;
	private String kursName;
	private double preis;
	private int maxteilnehmer;
	
	
	
	public Kurs(int maxteilnehmer, String kursName, double preis) {
		teilnehmerliste = new ArrayList<Teilnehmer>();
		this.maxteilnehmer = maxteilnehmer;
		this.kursName = kursName;
		this.preis = preis;
	}
	
	public boolean addTeilnehmer(Teilnehmer t) {
		boolean jam = false;
		if(maxteilnehmer>= teilnehmerliste.size()) {
			
			teilnehmerliste.add(t);
			jam = true;	
		}
		return jam;
	}
	
	public double total() {
		double wert=0;
		
		wert = wert + (preis*(double)teilnehmerliste.size());
		return wert;
	}

	public String toString() {
		return "\nTeilnehmeranzahl: " + teilnehmerliste.size() + "\nName: " + kursName + "\npreis: " + preis + "€";
	}
	
		
}