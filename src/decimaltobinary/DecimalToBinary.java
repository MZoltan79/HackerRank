package decimaltobinary;

import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary {
	
	static int consecutiveOnes(int num) {
		List<Integer> ones = new ArrayList<Integer>();
		String s = Integer.toBinaryString(num);
		char prev = s.charAt(0);
		int counter = 1;
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) == prev) {
				counter++;
			} else {
				ones.add(counter);
				counter = 1;
				prev = s.charAt(i);
			}
		}
		ones.add(counter);
//		return ones.stream().mapToInt(new ToIntFunction<Integer>() {
//
//			@Override
//			public int applyAsInt(Integer value) {
//				return value;
//			}
//		}).max().getAsInt();
		return ones.stream().mapToInt(Integer::intValue).max().getAsInt();
		
	}

	public static void main(String[] args) {
		System.out.println(consecutiveOnes(439));
		System.out.println(Integer.toBinaryString(439));
	}

}
