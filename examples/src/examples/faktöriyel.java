package examples;
import java.util.Scanner;

public class fakt�riyel {
	public static void fakt�riye() {
		Scanner scan = new Scanner(System.in);
		System.out.println("say� gir");
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
		fakt�riye();
	}


}
