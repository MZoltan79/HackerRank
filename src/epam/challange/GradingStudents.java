package epam.challange;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

	public static void main(String[] args) {
		Integer[] nums = {73,67,38,33};
		List<Integer> list =new ArrayList<Integer>();
//		for(int i: nums) {
//			if(i > 37) {
//				if(i % 10 > 7) {
//					double d = Math.round((double)i/10);
//					list.add((int) d*10);
//				} else if(i % 10 > 2 && i % 10 < 5) {
//					double d = Math.round((double)i/10);
//					list.add((int) d*10+5);
//				} else {
//					list.add(i);
//				}
//			} else {
//				list.add(i);
//			}
//		}
		for(int grade: nums) list.add(grade < 38 || grade % 5 < 3 ? grade : grade + (5 - (grade % 5)));
		System.out.println(list);	
	}

}
