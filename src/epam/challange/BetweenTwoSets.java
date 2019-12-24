package epam.challange;

import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {
	public static boolean areElementsOfAFactorsOfInt(int i, List<Integer> a) {
		for(int j: a) { 
			if(i % j != 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isIntFactorOfElementsOfB(int i, List<Integer> b) {
		for(int j: b) {
			if(j % i != 0) {
				return false;
			}
		}
		return true;
	}
	
	
	 public static int getTotalX(List<Integer> a, List<Integer> b) {
		 int counter = 0;
		 for(int i = 1; i <= b.get(b.size()-1); i++) {
			 if(areElementsOfAFactorsOfInt(i, a) &&
					 isIntFactorOfElementsOfB(i, b)) {
				 counter++;
			 }
		 }
		 	return counter;
		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> a = Arrays.asList(2, 4);
//		List<Integer> b = Arrays.asList(16, 32, 96);
		List<Integer> a = Arrays.asList(1);
		List<Integer> b = Arrays.asList(100);
		System.out.println(getTotalX(a, b));
 	}

}
