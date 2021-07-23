package homework1;

public class FordTruck implements Truck {
		private int aks;
		private int kilo;
		private String type;
		private String plate;
	
	FordTruck(int aks,int kilo){
		this.aks = aks;
		this.kilo = kilo;
		this.type = "Ford";
		this.plate = "lgs-2031";
	}

	@Override
	public int getAxles() {
		// TODO Auto-generated method stub
		return aks;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return kilo;
	}

	@Override
	public String getCarType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public String getPlate() {
		// TODO Auto-generated method stub
		return plate;
	}

}
