package examples;

import java.util.*;

public class Lab3_part2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		
		char test = line.charAt(0);
		if (test == 's' || test == 'S') {
			String[] temporary = new String[2];	
	    	temporary=line.split("\\s+");
	    	int length;
	    	
	    	length =Integer.parseInt(temporary[1]);
	    	double result = length*length;
	    	System.out.format("%.2f",result);
	    	
		}
		if (test == 'r' || test == 'R') {
			String[] temporary = new String[3];
			
	    	temporary=line.split("\\s+");
	    	int length,height;
	    	
	    	length =Integer.parseInt(temporary[1]);
	    	height =Integer.parseInt(temporary[2]);
	    	double result = length*height;
	    	System.out.format("%.2f",result);
			
		}
		if(test=='c' || test=='C') {
			String[] temporary = new String[2];	
	    	temporary=line.split("\\s+");
	    	int radius;
	    	
	    	radius =Integer.parseInt(temporary[1]);
	    	double pi = 3.14;
	    	double result = pi * radius * radius;
	    	System.out.format("%.2f",result);
		}
		
		
    	
	}

}
