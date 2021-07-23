package hw3;


public class ParallelogramPrism extends TriangularPrism {
    public double volume;
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	ParallelogramPrism(String sN, int h, int b) {
		super(sN, h, b);
		// TODO Auto-generated constructor stub
	}
	public void computeVolume() {
		setVolume(2*base*height);
		System.out.println(shapeName+" has height "+height+" and base "+base);
		System.out.println("Volume of PP is "+getVolume());
	}

}
