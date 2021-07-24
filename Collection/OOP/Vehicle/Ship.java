
public class Ship extends Machine implements Drivable {

	Ship(int t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public void howToDrive() {
		System.out.println("Use my rudder.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mainProperty() {
		System.out.println("I have anchor.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void howItWorks() {
		System.out.println("I need fuel to run.");
		// TODO Auto-generated method stub
		
	}

}
