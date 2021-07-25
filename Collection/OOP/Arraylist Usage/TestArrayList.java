package lab1;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {
	public static void main(String[] args) {
		// Create a list to store cities
		ArrayList<String> cityList=new ArrayList<String>();
		
		// Add some cities in the list
		
		cityList.add("Ankara");
		cityList.add("Kayseri");
		cityList.add("Bursa");
		cityList.add("Samsun");
		cityList.add("Edirne");
		
		// Show city size
		
		System.out.println("List Size = " + cityList.size());
		System.out.println("Is Kayseri in the list ?" + cityList.contains("Kayseri"));
		System.out.println("Is Mersin in the list ?" + cityList.contains("Mersin"));
		System.out.println("Is list empty ?" + cityList.isEmpty());
		
		// Insert a new city to specific index
		
		cityList.add(0, "Mersin");
		System.out.println(cityList.toString());
		
		// Remove a city from the list
		
		cityList.remove("Edirne");
		System.out.println(cityList.toString());
		cityList.remove(1);
		
		// Display the content of the list
		
		System.out.println(cityList.toString());
		
		// Display contents in reverse order
		
		for (int i=cityList.size()-1; i>=0; i--) {
			System.out.println(cityList.get(i));
		}
		
		// Display the content of the list with built-in function
		
		Collections.reverse(cityList);
		System.out.println("List after reversing " + cityList);

		
		// Create a array list which holds the class that you declared yourself
		
		System.out.println();
		ArrayList<Circle> list=new ArrayList<Circle>();
		
		list.add(new Circle(3));
		list.add(new Circle(10));
		list.add(new Circle(7));
		list.add(new Circle(4));
		
		// get size
		
		System.out.println("Circle array list size is " + list.size());
		
		System.out.println("The area of the circle" + list.get(0).getArea());
		
		for (int j=0; j<list.size(); j++) {
			list.get(j).displayObject();
		}

		
		// ArrayList examples with numbers
		
		ArrayList<Integer> listIInteger= new ArrayList<Integer>(5);
		listIInteger.add(2);
		listIInteger.add(2);
		listIInteger.add(2);
		listIInteger.add(2);
		listIInteger.add(2);

		
		
		
		
	}
	

}
