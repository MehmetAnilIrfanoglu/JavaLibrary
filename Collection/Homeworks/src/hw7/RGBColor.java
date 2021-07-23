package hw7;

public class RGBColor extends Semigroup<RGBColor> implements Complementable<RGBColor> {
	
	private int blue;
	private int red;
	private int green;

	public RGBColor(int r, int g, int b) {
		this.blue = b;
		this.red = r;
		this.green = g;	
	}
	public void setBlue(int b) {
		this.blue = b;
	}
	public void setRed(int r) {
		this.red = r;
	}
	public void setGreen(int g) {
		this.green = g;
	}
	public int getBlue() {
		return blue;
	}
	public int getRed() {
		return red;
	}
	public int getGreen() {
		return green;
	}
	public RGBColor complement(){
		int out_blue,out_red,out_green;
		out_red = 255 - this.red;
		out_green = 255 - this.green;
		out_blue = 255 - this.blue;
		return new RGBColor(out_red,out_green,out_blue);
	}
	public RGBColor operator(RGBColor RGB) {
		int op_red,op_green,op_blue;
		op_red = (RGB.getRed() + this.red) / 2 ;
		op_green = (RGB.getGreen() + this.green) / 2;
		op_blue = (RGB.getBlue() + this.blue) / 2;
		RGBColor rgb = new RGBColor(op_red,op_green,op_blue);	
		return rgb;
	}
}