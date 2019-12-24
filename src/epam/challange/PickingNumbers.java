package epam.challange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {
	
	public static int pickingNumbers(List<Integer> a) {
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		
		Collections.sort(a);
		Integer prev = a.get(0); 
		List<Integer> temp = new ArrayList<Integer>();
		for(int i = 1; i < a.size(); i++) {
			if(i == 1) {
				temp.add(prev);
			}
			if(prev == a.get(i)) {
				temp.add(a.get(i));
			} else {
				resultList.add(temp);
				prev = a.get(i);
				temp = new ArrayList<Integer>();
				temp.add(a.get(i));
			}
			
		}
		resultList.add(temp);
		System.out.println(resultList);
		List<Integer> sizes = new ArrayList<Integer>();
		sizes.add(resultList.get(0).size());
		for(int i= 1; i < resultList.size(); i++) {
			sizes.add(resultList.get(i).size());
			if(resultList.get(i).get(0)-resultList.get(i-1).get(0) == 1) {
				sizes.add(resultList.get(i-1).size()+resultList.get(i).size());
			}
		}
		System.out.println(resultList.get(resultList.size()-2).size());
		return sizes.stream().mapToInt(x -> x).max().getAsInt();
	    }

	public static void main(String[] args) {

		List<Integer> a = Arrays.asList(4, 97, 5, 97, 97, 4, 97, 4, 97, 97, 97, 97, 4, 4, 5, 5, 97, 5, 97, 99, 4, 97, 5, 97, 97, 97, 5, 5, 97, 4,
				5, 97, 97, 5, 97, 4, 97, 5, 4, 4, 97, 5, 5, 5, 4, 97, 97, 4, 97, 5, 4, 4, 97, 97, 97, 5, 5, 97, 4, 97, 97, 5, 4, 97, 97, 4, 97, 97,
				97, 5, 4, 4, 97, 4, 4, 97, 5, 97, 97, 97, 97, 4, 97, 5, 97, 5, 4, 97, 4, 5, 97, 97, 5, 97, 5, 97, 5, 97, 97, 97);
		System.out.println(pickingNumbers(a));
		
	}

}
