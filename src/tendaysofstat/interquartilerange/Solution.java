package tendaysofstat.interquartilerange;

import java.io.*;
import java.util.*;

public class Solution {

	static double median(int[] arr, int from, int to) {
		if ((to - from + 1) % 2 == 0) {
			return (arr[from + (to - from) / 2] + arr[from + (to - from) / 2 + 1]) / 2;
		} else {
			return arr[from + (to - from) / 2];
		}
	}

	static double[] calculateQuartiles(int[] arr) {
		double[] result = new double[3];
		Arrays.sort(arr);
		result[1] = median(arr, 0, arr.length - 1);
		if (arr.length % 2 == 0) {
			result[0] = median(arr, 0, arr.length / 2 - 1);
			result[2] = median(arr, arr.length / 2, arr.length - 1);
		} else {
			result[0] = median(arr, 0, arr.length / 2 - 1);
			result[2] = median(arr, arr.length / 2 + 1, arr.length - 1);
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("interquartileRange.txt"));
		Scanner sc = new Scanner(br);
		int n = sc.nextInt();
		int[] elements = new int[n];
		int[] freq = new int[n];
		for (int i = 0; i < n*2; i++) {
			if(i < n) {
				elements[i] = sc.nextInt();
			} else {
				freq[i-n] = sc.nextInt();
			}
		}
		int arrLength = Arrays.stream(freq).sum();
		int[] arr = new int[arrLength];
		int index = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < freq[i]; j++) {
				arr[index++] = elements[i];
			}
		}
		Arrays.sort(arr);
		
		double[] result = calculateQuartiles(arr);
		System.out.printf("%.1f %n", result[2]-result[0]);
		sc.close();
		br.close();

	}

}
