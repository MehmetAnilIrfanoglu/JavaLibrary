package hw2;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task2 {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void read_albums(String filename) throws IOException {
		  
			Scanner scan = new Scanner(Paths.get(filename + ".txt"));
			ArrayList<String> array_list = new ArrayList<String>(); 

	        while (scan.hasNextLine()){
	        	 String line = scan.nextLine();
	        	 String[] temp_word = null;
	             temp_word = line.split("-");
	             String temp = temp_word[0];
	             array_list.add(temp);
	    }
	         scan.close(); 
	         
	         HashMap<String, Integer> map = new HashMap<>();
	         Set<String> unique = new HashSet<String>(array_list);
	         
	         for (String key : unique) {
	        	 map.put(key, Collections.frequency(array_list, key));
	         }
	         
	         Object[] a = map.entrySet().toArray();
	        
	         Arrays.sort(a, new Comparator() {
	             public int compare(Object o1, Object o2) {
	             return ((Map.Entry<String, Integer>) o2).getValue()
	            		 .compareTo(((Map.Entry<String, Integer>) o1)
	            				 .getValue());
	             }
	         }
	    );
	         for (Object e : a) {
	             System.out.println(((Map.Entry<String, Integer>) e).getKey() + " : "
	                     + ((Map.Entry<String, Integer>) e).getValue());
	         }
	}
	public static void main(String[] args) throws IOException {
		read_albums("albums");
	}
}


