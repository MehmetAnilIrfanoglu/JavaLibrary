package hw7;

import java.util.BitSet;

public class BinaryWord implements Complementable<BinaryWord> {
	

	private BitSet bitS;
	private int length_of_bit;
	
	public String BitSetToString(BitSet temp) {
		String result = "";		
		for (int i = 0; i < length_of_bit; i++) {
			result += Integer.toString(temp.get(i) ? 1 : 0);
		}		
		return result;
	}
	
	public BinaryWord complement() {
		BitSet set = new BitSet(this.length_of_bit);
		set.or(this.bitS);
		set.flip(0, this.length_of_bit);		
		BinaryWord out = new BinaryWord(BitSetToString(set));		
		return out;

	}
	
	
	public BinaryWord(String in) {
		this.length_of_bit = in.length();
		this.bitS = new BitSet(length_of_bit);		
		for (int i = 0; i < length_of_bit; i++) {
			if (in.charAt(i) == '1') {
				this.bitS.set(i);
			}
		}
	}
	public String toString() {
		return BitSetToString(bitS);
	}
}