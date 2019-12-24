package problemsolving.divisiblesumpairs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		BufferedReader br;
		try {
			br = new BufferedReader(
					new FileReader("divisible.txt"));
			Scanner scanner = new Scanner(br);
			 String[] nk = scanner.nextLine().split(" ");

		        int n = Integer.parseInt(nk[0]);

		        int k = Integer.parseInt(nk[1]);

		        int[] ar = new int[n];

		        String[] arItems = scanner.nextLine().split(" ");
		        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		        for (int i = 0; i < n; i++) {
		            int arItem = Integer.parseInt(arItems[i]);
		            ar[i] = arItem;
		        }

		        int result = divisibleSumPairs(n, k, ar);
		        System.out.println(result);
			
			
			scanner.close();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int divisibleSumPairs(int n, int k, int[] ar) {
		int sum = 0;
		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				if((ar[i]+ar[j]) % k == 0){
					sum++;
				}
			}
		}
		return sum;
	}

}
