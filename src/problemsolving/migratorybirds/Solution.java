package problemsolving.migratorybirds;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class Solution {

	public static void main(String[] args) {
		BufferedReader br;
		try {
			br = new BufferedReader(
					new FileReader("birds.txt"));
			Scanner scanner = new Scanner(br);

			int arrCount = Integer.parseInt(scanner.nextLine().trim());

	        List<Integer> arr = Stream.of(scanner.nextLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        int result = migratoryBirds(arr);
	        System.out.println(result);
			
			
			scanner.close();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static int migratoryBirds(List<Integer> arr) {
		List<Integer> count = Arrays.asList(0,0,0,0,0);
		for(int i: arr) {
			count.set(i-1,count.get(i-1)+1);
		}
		int max = 0;
		int index = 0;
		for(int i = 0; i < count.size(); i++) {
			if(count.get(i) > max) {
				max = count.get(i);
				index = i;
			}
		}
		return index + 1;
	}

}
