package epam.challange;

import java.util.Arrays;
import java.util.List;

public class DayOfTheProgrammer {
	
	static String dayOfProgrammer(int year) {
		if(year < 1918 && year % 4 == 0) { 
			return "12.09." + year;
		} else if(year < 1918 && year % 4 != 0) {
			return "13.09." + year;
		} else if(year == 1918) {
			return "26.09.1918";
		} else if(year > 1918) {
			if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
				return "12.09."+year;
			} else {
				return "13.09." + year;
			}
		}
		return null;
    }

	public static void main(String[] args) {
		
		List<Integer> years = Arrays.asList(1600, 1700, 1701, 1704, 1900, 1917, 1918, 1919, 2016, 2017, 2018, 2019, 2020);
 		
		years.forEach(year -> {
			System.out.println(year + "\n" + dayOfProgrammer(year));
		});
		System.out.println(dayOfProgrammer(2100));
	}

}
