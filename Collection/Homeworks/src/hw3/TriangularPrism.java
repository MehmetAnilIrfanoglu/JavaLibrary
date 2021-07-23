package hw3;


public class TriangularPrism extends Shape {
      public int base;
      private double volume;
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	TriangularPrism(String sN, int h,int b) {
		super(sN, h);
		this.base = b;
		// TODO Auto-generated constructor stub
	}
	public void commputeVolume() {
		setVolume(height*base);
		System.out.println(shapeName+" height is "+height+" and base is "+base);
		System.out.println("Volume of TP is "+getVolume());
	}

}
