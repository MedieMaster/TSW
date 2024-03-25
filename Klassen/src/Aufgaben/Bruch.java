package Aufgaben;

public class Bruch {
	
	private int zaehler, nenner;
	
	public Bruch() {
		zaehler=1;
		nenner=1;
	}
	
	
	public Bruch(int zaehler, int nenner) {
		
		if(nenner==0)
			throw new IllegalArgumentException("Nenner 0 nicht zulässig");
		else {
			this.zaehler=zaehler;
			this.nenner=nenner;
		}
	}
	
	public Bruch(Bruch bn) {
		this.zaehler = bn.zaehler;
		this.nenner = bn.nenner;
		
	}
	
	public Bruch add(Bruch b2) {
		Bruch b3 = new Bruch(0, 0);
		if(this.nenner != b2.nenner) {
			Bruch bn1 = new Bruch(this);
			Bruch bn2 = new Bruch(b2);
			
			bn1.erweitern(bn2);
			
			b3.zaehler = bn1.zaehler+bn2.zaehler;
			b3.nenner = bn1.nenner;
		} else {
			b3.zaehler = this.zaehler+b2.zaehler;
			b3.nenner = this.nenner;
		}
		
		return b3;
	}
	
	public Bruch sub(Bruch b2) {
		Bruch b3 = new Bruch(0, 0);
		if(this.nenner != b2.nenner) {
			Bruch bn1 = new Bruch(this);
			Bruch bn2 = new Bruch(b2);
			bn1.erweitern(bn2);
			b3.zaehler = bn1.zaehler-bn2.zaehler;
			b3.nenner = bn1.nenner;
		} else {
			b3.zaehler = this.zaehler-b2.zaehler;
			b3.nenner = this.nenner;
		}
		
		return b3;
	}
	
	public Bruch multi(Bruch b2) {
		Bruch b3 = new Bruch(0, 0);
		
		b3.zaehler = this.zaehler * b2.zaehler;
		b3.nenner = this.nenner * b2.nenner;
		
		
		
		return b3;
	}
	
	public Bruch div(Bruch b2) {
		if(b2.nenner==0) {
			throw new IllegalArgumentException("Nenner 0 nicht zulässig");
		}
		Bruch b3 = new Bruch(0, 0);
		b3.zaehler = this.zaehler * b2.nenner;
		b3.nenner = this.nenner * b2.zaehler;
		
		return b3;
	}
	
	public double komma() {
		return (double)this.zaehler/this.nenner; 
	}
	
	public String toString() {
		String test;
		test = this.zaehler + "/" + this.nenner;
		return test;
	}
	
	public Bruch erweitern(Bruch b2) {
		b2.zaehler = b2.zaehler * this.nenner;
		this.nenner=this.nenner * b2.nenner;
		this.zaehler=this.zaehler * b2.nenner;
		b2.nenner = this.nenner;
		
		return b2;
	}
	
	public Bruch kuerzen(Bruch b3) {
		int max;
		if(b3.zaehler>b3.nenner) {
			max = b3.zaehler;
		} else {
			max = b3.nenner;
		}
		
		for(int i=max; i>0; i--) {
			if (b3.zaehler%i==0 && b3.nenner%i==0) {
				b3.zaehler=b3.zaehler/i;
				b3.nenner=b3.nenner/i;
				i=0;
			}
		}
		return b3;
	}

	public int getZaehler() {
		return zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	public void setNenner(int nenner) {
		if(nenner==0) {
			throw new IllegalArgumentException("Nenner 0 nicht zulässig");
		}else
		this.nenner = nenner;
	}

}
