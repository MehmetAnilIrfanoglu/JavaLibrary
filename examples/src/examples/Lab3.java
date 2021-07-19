package examples;

import java.util.*;

public class Lab3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] temporary = new String[3];
		String line = scan.nextLine();	
    	temporary=line.split("\\s+");
    	int a,b,c;
    	a =Integer.parseInt(temporary[0]);
    	b =Integer.parseInt(temporary[1]);
    	c =Integer.parseInt(temporary[2]);
    	
    	
    	if (a<b && a<c && b<c) {
    		System.out.println("increasing");
    	}
    	else {
    		if(c<b && c<a && b<a) {
    			System.out.println("decreasing");
    		}
    		else {
    			System.out.println("neither increasing or decreasing order");
    		}
    	}
	}

}
