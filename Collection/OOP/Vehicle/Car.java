
public class Car extends Machine implements Drivable  {

	Car(int t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public void howToDrive() {
		System.out.println("Use my steering wheel to drive.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mainProperty() {
		System.out.println("I have 4 wheels.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void howItWorks() {
		System.out.println("I need fuel to run.");
		// TODO Auto-generated method stub
		
	}

	
}
