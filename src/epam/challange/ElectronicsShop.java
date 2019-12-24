package epam.challange;

import java.util.ArrayList;
import java.util.List;

public class ElectronicsShop {
	
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		List<Integer> sumPrices = new ArrayList<Integer>();
        for(int i: keyboards) {
        	for(int j: drives) {
        		if(b >= (i+j)) {
        			sumPrices.add(i + j);
        		}
        	}
        }
       if(sumPrices.isEmpty()) return -1;
       return sumPrices.stream().mapToInt(x -> x).max().getAsInt();
    }

	public static void main(String[] args) {
		int b = 10;
		int[] keyboards = {3, 1};
		int[] drives = {5, 2, 8};
		System.out.println(getMoneySpent(keyboards, drives, b));
	}

}
