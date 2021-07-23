package hw3;


public class Cylinder extends Shape{
	private double volume;
    public int radius;
    public int pi = 3;
	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
	  Cylinder(String sN,int h,int r){
		  super(sN,h);
		  this.radius = r;
	  }
	  public void computeVolume(){
		  setVolume(pi*radius*radius*height);
		  System.out.println(shapeName+" has height "+height+" and radius "+radius);
		  System.out.println("Volume of "+shapeName+" is "+getVolume());

		  
	  }

}
