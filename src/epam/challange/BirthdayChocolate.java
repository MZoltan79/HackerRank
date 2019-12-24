package epam.challange;

import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {
	
	 static int birthday(List<Integer> s, int d, int m) {
		 int counter = 0;
		 for(int i = 0; i < s.size()-(m-1); i++) {
			 int sum = 0;
			 for(int j = i; j < i+m; j++) {
				 sum += s.get(j);
			 }
			 if(sum == d) {
				 counter++;
			 }
		 }
		 return counter;
	    }
	public static void main(String[] args) {
		Integer[] case1 = {1, 2, 1, 3, 2}; //3, 2
		System.out.println(birthday(Arrays.asList(case1), 3, 2));
		Integer[] case2 = {1,1,1,1,1,1}; //3, 2
		System.out.println(birthday(Arrays.asList(case2), 3, 2));
		Integer[] case3 = {4}; //4,1
		System.out.println(birthday(Arrays.asList(case3), 4, 1));
		
	}

}
