package epam.challange;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SockMerchant {
	
	 static int sockMerchant( int[] ar) {
		 int result = 0;
		 Map<Integer, Integer> socks = new HashMap<>();
		 int counter = 1;
		 for(int i: ar) {
			 if(!socks.containsKey(i)) {
				 socks.put(i, counter);
			 } else {
				 socks.put(i, socks.get(i)+1);
			 }
		 }
		 System.out.println(socks);
		 for(Entry<Integer, Integer> entry: socks.entrySet()) {
			 result += entry.getValue()/2;
		 }
		return result;
	    }

	public static void main(String[] args) {
		
		int[] ar = {1, 2, 1, 2, 1, 3, 2};
//		int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		System.out.println(sockMerchant(ar));

	}

}
