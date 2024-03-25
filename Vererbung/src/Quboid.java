
public class Quboid extends Rectangle {

	private int height;
	
	public Quboid() {
		this(1, 1, 1);
	}
	
	public Quboid(int length, int width, int height) {
		super(length, width);
		this.height = height;
	}

	int getHeight() {
		return height;
	}
	
	void setHeight(int height) {
		this.height = height;
	}
	
	int getVolume() {
		return getHeight() * getLength() * getWidth();
	}
	
}
