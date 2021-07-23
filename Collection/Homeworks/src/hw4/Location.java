package hw4;


public class Location {
	int x_cordinate;
	int y_cordinate;
	double distance;
	
	    Location (int x,int y){
	    	this.x_cordinate=x;
	    	this.y_cordinate=y;
	    }
	    public int getX_cordinate() {
			return x_cordinate;
		}
		public void setX_cordinate(int x_cordinate) {
			this.x_cordinate = x_cordinate;
		}
		public int getY_cordinate() {
			return y_cordinate;
		}
		public void setY_cordinate(int y_cordinate) {
			this.y_cordinate = y_cordinate;
		}

}
