package examples;
import java.util.*;
public class seperate_numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String test = scan.nextLine();
		String[] array = null;
		int[] save = new int[2];
		array = test.split(" ");
		String str = array[0];
		String str2 = array[1];
		save[0] = Integer.parseInt(str);
		save[1] = Integer.parseInt(str2);
		System.out.println(save[0]);
		System.out.println(save[1]);
		System.out.println(test);
		scan.close();
	}

}
