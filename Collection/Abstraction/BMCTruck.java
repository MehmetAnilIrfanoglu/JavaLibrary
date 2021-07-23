package homework1;

public class BMCTruck implements Truck {
		private int axles;
		private int weight;
		private String type;
		private String plate;
	
	BMCTruck(int aks,int kilo){
		this.axles = aks;
		this.weight = kilo;
		this.type = "BMC";
		this.plate = "lek-1021";
	}

	@Override
	public int getAxles() {
		// TODO Auto-generated method stub
		return axles;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
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
