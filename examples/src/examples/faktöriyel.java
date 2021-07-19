package examples;
import java.util.Scanner;

public class faktöriyel {
	public static void faktöriye() {
		Scanner scan = new Scanner(System.in);
		System.out.println("sayý gir");
		int sayi = scan.nextInt();
		scan.close();
		int test = 1;
	   while(sayi>0) 
	   {
			test *=sayi;
			sayi--;
		}
		System.out.println("number is "+test);

	}
	public static void main(String[] args) {
		faktöriye();
	}


}
