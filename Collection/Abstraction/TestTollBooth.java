package homework1;

import java.util.Scanner;



public class TestTollBooth {
	public static void main(String [] args){
			
			Scanner scan = new Scanner(System.in);
			TollBooth booth = new AlleghenyTollBooth();
			Truck tr[] = { new FordTruck(5, 12500),new NissanTruck(6, 15000),new BMCTruck(5, 12500)};
	
			
			int element=0;
		
			while(0 == 0) {
				
				System.out.println("1:Scan barcode");
				System.out.println("2: display data");
				System.out.println("3:restart meter");
				int section = scan.nextInt();
				if (section==4) {
					System.out.println("Quiting");
					break;}
				
				if (section==1) {
					if(tr.length<=element) {
						System.out.println("no car came");
					}
					else {
						booth.calculateToll(tr[element]);
						element++;
					}
					
				}
				if (section==2) {
					booth.displayData();
				}
				if (section==3) {
					booth.restart();
				}
				
			}
			scan.close();
	}
}



