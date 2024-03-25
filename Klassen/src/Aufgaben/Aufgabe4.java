package Aufgaben;

public class Aufgabe4 {
	private String klassenname, klassenlehrer_name;
	private int anzahl_schueler, anzahl_woechentlichestunden;

	public String getKlassenname() {
		return klassenname;
	}

	public void setKlassenname(String klassenname) {
		this.klassenname = klassenname;
	}

	public String getKlassenlehrer_name() {
		return klassenlehrer_name;
	}

	public void setKlassenlehrer_name(String klassenlehrer_name) {
		char[] test = klassenlehrer_name.toCharArray();
		int count = test.length;
		char[] test2 = new char[3];
		for (int i=0; i < count; i++) {
			
			if (test[i] == ' ') {
				test2[0] = test[i+1];
				test2[1] = test[i+2];
				i = count;
			}
			
		}
		test2[2] = test[0];
		
		klassenlehrer_name = new String(test2);
		klassenlehrer_name = klassenlehrer_name.toUpperCase();
		
		this.klassenlehrer_name = klassenlehrer_name;
	}

	public int getAnzahl_schueler() {
		return anzahl_schueler;
	}

	public void setAnzahl_schueler(int anzahl_schueler) {
		if (anzahl_schueler > 34 || anzahl_schueler < 0) {
			anzahl_schueler = 0;
		}
		else {
			this.anzahl_schueler = anzahl_schueler;
		}
	}

	public int getAnzahl_woechentlichestunden() {
		return anzahl_woechentlichestunden;
	}

	public void setAnzahl_woechentlichestunden(int anzahl_woechentlichestunden) {
		if (anzahl_woechentlichestunden > 40 || anzahl_woechentlichestunden < 0) {
			this.anzahl_woechentlichestunden = 0;
		}
		else {
			this.anzahl_woechentlichestunden = anzahl_woechentlichestunden;
		}
	}
}