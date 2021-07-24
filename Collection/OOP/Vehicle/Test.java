/*
 *  ismail öksüz 150119516
 */

public class Test  {
	public static void main(String[] args) {
		Machine[] mach = new Machine[5];
		mach[0] = new Car(1);
		mach[1] = new Computer(2);
		mach[2] = new Computer(2);
		mach[3] = new Ship(3);
		mach[4] = new Ship(3);
		
		for (int i =0;i<mach.length;i++) {
			System.out.println(mach[i].getType());
		}
		
		((Car) mach[0]).howToDrive();
		((Ship) mach[3]).howToDrive();
		((Ship) mach[4]).howToDrive();
		
		mach[3].mainProperty();
		mach[4].mainProperty();
		
		mach[1].howItWorks();
		mach[2].howItWorks();
		
		
		
		
		
		
	}

}
