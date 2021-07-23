package hw4;


public class Security extends Person {
 
  private String name;
  private int x_cord;
  private int y_cord;
	
	Security (String n,int x,int y){
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

	@Override
	public double getDistance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
