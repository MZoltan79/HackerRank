package thirtydays;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

	public static void main(String[] args) {
		Map<String, Integer> pBook =  new HashMap<String, Integer>();
		pBook.put("Sam", 4446987);
		pBook.put("John", 5556987);
		pBook.put("Emily", 3336987);
		String[] names = {"Sam","Edward","Emily"};
		for(String s: names) {
			if(pBook.containsKey(s)) {
				System.out.println(pBook.get(s));
			} else {
				System.out.println("Not found");
			}
		}
		
	}

}
