package homework1;

import java.util.LinkedList;

public class AlleghenyTollBooth implements TollBooth {
	
	private int tolldue;
	LinkedList <Truck> trucks = new LinkedList<Truck>();
	
	AlleghenyTollBooth(){
		this.tolldue = 0;
		
	}
	@Override
	public void calculateToll(Truck T) {
		
		trucks.add(T);
		int toll = ((T.getAxles()*5) + (((T.getWeight()/500)/2)*10));
		tolldue += toll;
		System.out.println("Axles: " + T.getAxles() + " Truck weight: " + T.getWeight() + " Toll Due: " + toll);
		System.out.println("Truck info :>  Truck name: "+ T.getCarType() +" / Plate No: "+ T.getPlate());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayData() {
		System.out.println("No of Trucks: " + trucks.size());
		System.out.println("Receipt: " + tolldue);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void restart() {
		System.out.println("*** Collecting receipts ***");
		System.out.println("Totals - Receipts: "+ tolldue + " Trucks: " + trucks.size());
		tolldue = 0;
		trucks.clear();
		
		// TODO Auto-generated method stub
		
	}

}
