package hw3;


public class RectangularPrism extends Cube {
      private int length;
      private int width;
      private double volume;
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	RectangularPrism(String sN, int h,int l,int w) {
		super(sN, h);
		this.length = l;
		this.width = w;
		// TODO Auto-generated constructor stub
	}
	public void computeVolume() {
		setVolume(height*length*width);
		System.out.println(shapeName+" has height "+height+" width "+width);
		System.out.println("Volume of RP is "+getVolume());
	}

}
