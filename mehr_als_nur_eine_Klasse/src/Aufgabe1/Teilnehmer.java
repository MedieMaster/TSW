package Aufgabe1;

public class Teilnehmer {
	private int id;
	private String name;
	
	public Teilnehmer(int id, String name) {
		if(id<0)
			throw new IllegalArgumentException ("Die id muss Positiv sein\n");
		this.id=id;
		this.name=name;
	}

	public String toString() {
		return "\nid: " + id + "\nName=" + name;
	}
	
	
}
