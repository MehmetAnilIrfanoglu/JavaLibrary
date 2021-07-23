
public class Customer {
	
	private String name;
	private int promotion;
	private Item basket[] = new Item[30];
	private int counter =0;
	private int calculatedPayment;
	private double discountedPayment;
	
	Customer () {
		this.name = "unknown";
		this.promotion = 100;
		this.discountedPayment = 0;
		this.calculatedPayment = 0;
	}
	
	Customer (String name){
		this.name = name;
		this.promotion = 100;
		this.discountedPayment = 0;
		this.calculatedPayment = 0;
	}
	
	Customer(String name,int promotion){
		this.name = name;
		this.calculatedPayment = 0;
		this.discountedPayment =0;
		 
		this.promotion = (0<=promotion)&&(promotion<=100) ? promotion:100;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPromotion() {
		return promotion;
	}

	public void setPromotion(int promotion) {
		this.promotion = promotion;
	}
	
	public void addItem(Item item) {
		basket[counter]=item;
		calculatedPayment += item.getPrice();
		discountedPayment =(double) (calculatedPayment) * promotion / 100;
		counter++;
	}
	
	public void deleteItem(String item) {
		int index = 0;
		
		for (int i=0;i<basket.length;i++) {
			if (basket[i].getName().equals(item)) {
				index = i;
				break;
			}
		}
		calculatedPayment -= basket[index].getPrice();
		discountedPayment = (double) (calculatedPayment) * promotion / 100;
			
		for (int j=index;j<basket.length;j++) {
			
			if (basket[j+1]==null) {
				break;
			}
			basket[j].setName(basket[j+1].getName());
			basket[j].setPrice(basket[j+1].getPrice());
		}
		counter--;
	}
	public void listItem() {
		//int totalMoney = 0;
		for (int i=0;i<counter;i++) {
			System.out.println((i+1)+" "+basket[i].getName()+" "+basket[i].getPrice());
			//System.out.println("name "+basket[i].getName());
			//System.out.println("price "+basket[i].getPrice());
			//totalMoney += basket[i].getPrice();
		}
		//double discounted_money = totalMoney * promotion / 100;
		  
		System.out.println("Total price: "+ calculatedPayment);
		System.out.println("Discounted Price: "+ discountedPayment);
	}

}
