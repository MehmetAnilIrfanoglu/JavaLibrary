package hw4;


public class Thief extends Person {
	private String name;
	private int x_cord;
	private int y_cord;
	
		Thief(String n,int x,int y){
			this.name = n;
			this.x_cord = x;
			this.y_cord = y;
		}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int x_cord() {
		// TODO Auto-generated method stub
		return this.x_cord;
	}

	@Override
	public int y_cord() {
		// TODO Auto-generated method stub
		return this.y_cord;
	}
	public double getDistance () {
		return Math.sqrt(x_cord*x_cord+y_cord*y_cord);
	}
	
	}

