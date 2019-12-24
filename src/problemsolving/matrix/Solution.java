package problemsolving.matrix;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;
//import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'diagonalDifference' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * 2D_INTEGER_ARRAY arr as parameter.
	 */

	public static int diagonalDifference(List<List<Integer>> arr) {
		int sum = 0;
		for(int i = 0; i < arr.size(); i++) {
			sum += arr.get(i).get(arr.size()-1-i) - arr.get(i).get(i); 
		}
		return Math.abs(sum);

	}

}

public class Solution {

	public static void main(String[] args) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("matrix.txt"));
			Scanner sc = new Scanner(br);
			int n = Integer.parseInt(sc.nextLine());

			List<List<Integer>> arr = new ArrayList<>();

			IntStream.range(0, n).forEach(i -> {
				arr.add(Stream.of(sc.nextLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(toList()));
			});
			System.out.println(arr);
			int result = Result.diagonalDifference(arr);
			System.out.println(result);

			br.close();
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
