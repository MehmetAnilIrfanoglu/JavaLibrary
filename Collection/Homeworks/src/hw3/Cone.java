package hw3;


public class Cone extends Cylinder {
    private double volume;
    private int pi = 3;
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	Cone(String sN, int h, int r) {
		super(sN, h, r);
		
		// TODO Auto-generated constructor stub
	}
	public void computeVolume() {
		setVolume(pi*radius*radius*height/3);
		System.out.println(shapeName +" has height "+height+" with radius "+radius);
		System.out.println("Volume of "+shapeName+" is "+getVolume());
	}

}
