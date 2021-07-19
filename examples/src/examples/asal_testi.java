package examples;

public class asal_testi {
public static boolean asal(int number) {
	for (int i=2;i<number;i++) {
		if (number%i==0) {
			return false;
		}
	}
	return true;
}
	public static void main(String[] args) {
		for (int j=2;j<1000;j++) {
			if(asal(j)) {
				System.out.println(j);
			}
		}
	}
}

