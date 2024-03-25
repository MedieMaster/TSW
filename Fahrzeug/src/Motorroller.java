
public class Motorroller extends Fahrzeug{
	
	int test = 10;

	public Motorroller(int raeder, double vMax) {
		super(raeder, vMax);
		
	}

	public void test() {
		System.out.print("Motorroller");
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
}
