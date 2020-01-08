package epam.challange;

import java.util.Arrays;

public class BreakingTheRecords {
	
	 static int[] breakingRecords(int[] scores) {
		 int[] result = {0, 0};
		 int most = scores[0];
		 int least = scores[0];
		 for(int i: scores) {
			 if(i > most) {
				 most = i;
				 result[0]++;
			 }
			 if(i < least) {
				 least = i;
				 result[1]++;
			 }
		 }
		 return result;
	    }

	public static void main(String[] args) {
		int[] case1 = {10, 5, 20, 20, 4, 5, 2, 25, 1};
		int[] case2 = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
		System.out.println(Arrays.asList(breakingRecords(case1)));
 		System.out.println(Arrays.asList(breakingRecords(case2)));

	}

}
