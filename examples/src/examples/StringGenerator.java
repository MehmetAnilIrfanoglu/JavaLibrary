package examples;

import java.util.ArrayList;
import java.util.Scanner;

public class StringGenerator {
	
	public static int sum;
	public static ArrayList<String> tot = new ArrayList<String>();
	
	
	public static void gen(int n) {
		String a = "";
		String b = "";
		if (n==0) {
			sum += 1;
		}
		else {
			a += "1";
			gen(1,n,a);
			b += "0";
			gen(0,n,b);

		}
	}
	
	public static void gen(int num,int n,String a) {
		if (n==1) {
			sum +=1;
			tot.add(a);
			
		}
		else {
			if (num==1) {
				a+="0";
				gen(0,n-1,a);
				
			}
			if(num==0) {
				String b =a;
				a += "1";
				b += "0";
				gen(1,n-1,a);
				gen(0,n-1,b);
			}
		}
	}
	
	
	public static int rec(int a) {
		if(a <= 1) {
			return a;
		}
		else {
			int c =rec(a-1);
			int b =rec(a-2);
			return c+b;
		}
	}
	
	
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the string: ");
		int a = scan.nextInt();
		while(a<=0) {
			System.out.println("Enter valid length.");
			System.out.println("Enter the length of the string: ");
			a = scan.nextInt();
		}
		
		gen(a);
		int res = rec(a);
		System.out.println(res);
		System.out.println("Possibilities number: " +sum);
		System.out.println("\nPossibilities:");
		for(int i=0;i<tot.size();i++) {
			System.out.println((i+1)+". "+tot.get(i));
		}
		
		
	}

}
