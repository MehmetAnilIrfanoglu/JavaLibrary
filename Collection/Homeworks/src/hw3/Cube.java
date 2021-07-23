package hw3;



public class Cube extends Shape {
	private double volume;
	
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	Cube(String sN,int h){
		super(sN,h);
		
		
	}
	public void computeVolume() {
	   
		setVolume(height*height*height);
		System.out.println(shapeName+" has height "+height);
		System.out.println("Volume of "+shapeName+" is "+getVolume());
		//System.out.printf("%0.2f", (float)getVolume());
       // System.out.println("double : " + String.format("%.2f",(float) getVolume()));



}

}
