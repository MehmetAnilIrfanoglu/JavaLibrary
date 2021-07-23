import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		Customer c1 = new Customer("Ali",90);
		Customer c2 = new Customer("Ayþe");
		Customer c3 = new Customer();
		c3.setPromotion(70);
		
		
		
		int dummy = 0;
		while (dummy==0) {
			Customer dummy_object = new Customer();
			System.out.println("(1) "+c1.getName());
			System.out.println("(2) "+c2.getName());
			System.out.println("(3) "+c3.getName());
			System.out.println("(4) Terminate");
			int section = Integer.parseInt(scan.nextLine());
			if (section == 4) {
				break;
			}
			switch (section) {
			case 1:
				dummy_object = c1;
				break;
			case 2:
				dummy_object = c2;
				break;
			case 3:
				dummy_object = c3;
				break;
			}
			System.out.println("(1) AddItem");
			System.out.println("(2) DeleteItem");
			System.out.println("(3) ListItems");
			
			int subsection = Integer.parseInt(scan.nextLine());
			String tempName;
			int tempPrice;
			switch (subsection) {
			case 1:
				System.out.println("Enter the name of the item: ");
				tempName = scan.nextLine();
				System.out.println("Enter the price of the item: ");
				tempPrice = Integer.parseInt(scan.nextLine());
				tempPrice = (0<=tempPrice) ? tempPrice:0;
				dummy_object.addItem(new Item(tempName,tempPrice));
				
				
				break;
			case 2:
				System.out.println("Enter the name of the item: ");
				String delete_item = scan.nextLine();
				dummy_object.deleteItem(delete_item);
				
				
				break;
			case 3:
				dummy_object.listItem();
				
				break;
			}
			switch (section) {
			case 1:
				c1=dummy_object;
				break;
			case 2:
				c2=dummy_object;
				break;
			case 3:
				c3=dummy_object;
				break;
			}
			
			
		}
		
	}
}