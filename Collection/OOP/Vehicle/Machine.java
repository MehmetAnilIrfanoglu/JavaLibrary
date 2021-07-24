
public abstract class Machine  {
	public int Type;
	
	Machine(int t){
		this.Type=t;
	}
	
	public int getType() {
		return Type;
	}
	
	public abstract void mainProperty();
	public abstract void howItWorks();

	

	
	

}
