package tendaysofstat.deviation;

import java.io.*;
import java.util.*;

public class Solution {

	static double deviation(int[] arr) {
		double mean = Arrays.stream(arr).sum()/arr.length;
		double sumDev = 0;
		for(int i: arr) {
			sumDev += Math.pow((i-mean), 2);
		}
		return Math.sqrt(sumDev/arr.length);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("deviation.txt"));
		Scanner sc = new Scanner(br);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.printf("%.1f %n", deviation(arr));
		sc.close();
		br.close();
	}


}
