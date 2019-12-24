package bitsets;

import java.util.BitSet;

public class BitSetDemo {

	public static void main(String[] args) {
		BitSet bits1 = new BitSet(16);
		BitSet bits2 = new BitSet(16);
		

		//set some bits
		for(int i = 0; i < 16; i++) {
			if(i%2 == 0) bits1.set(i);
			if(i%5 != 0) bits2.set(i);
		}
		
		System.out.println("initial pattern in bits1:");
		System.out.println(bits1);
//		for(int i = 0; i < bits1.length(); i++) {
//			System.out.println(i + ": " + bits1.get(i));
//		}
		System.out.println("initial pattern in bits2:");
		System.out.println(bits2);
		
//		bits2.and(bits1);
//		System.out.println(bits2);
//		
//		bits2.or(bits1);
//		System.out.println(bits2);
		
		bits2.xor(bits1);
		System.out.println(bits2);
		System.out.println(bits1.cardinality());
		
	}

}
