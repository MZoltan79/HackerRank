package epam.challange;

import java.util.Arrays;
import java.util.List;

public class BonApetit {
	
	  static void bonAppetit(List<Integer> bill, int k, int b) {
		  int sum = 0;
		  for(int i = 0; i < bill.size(); i++) {
			  if(i != k) {
				  sum += bill.get(i);
			  }
		  }
		  if(sum/2 == b) {
			  System.out.println("Bon Appetit");
		  } else {
			  System.out.println(b - (sum/2));
		  }
	    }

	public static void main(String[] args) {
		List<Integer> bill = Arrays.asList(3, 10, 2, 9);
		int k = 1;
		int b = 7;
		bonAppetit(bill, k, b);
		
	}

}
