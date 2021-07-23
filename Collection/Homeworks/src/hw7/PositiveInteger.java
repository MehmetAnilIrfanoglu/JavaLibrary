package hw7;


public class PositiveInteger extends Semigroup<PositiveInteger> {
	private int pos_int;
	
	public PositiveInteger operator(PositiveInteger posInt) {
		PositiveInteger obj = new PositiveInteger(posInt.getPos_int() + this.pos_int);
		return obj;
	}
	
	public PositiveInteger(int input) {
		if (input >= 0) {
			this.pos_int = input;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public void setPos_int(int pos_int) {
		this.pos_int = pos_int;
	}
	
	public int getPos_int() {
		return pos_int;
	}
	
	public PositiveInteger() {
		this(0);
	}
	
}