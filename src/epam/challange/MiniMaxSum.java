package epam.challange;

import java.util.Arrays;

public class MiniMaxSum {
	
	public static void miniMaxSum(int[] arr) {
		int sum = 0;
		for(int i: arr) {
			sum += i;
		}
		Arrays.sort(arr);
		System.out.printf("%d %d %n",sum - arr[arr.length-1],(sum - arr[0]));
	}

	public static void main(String[] args) {
		int[] arr = {1232, 1455, 5, 7, 9};
		int[] arr2 = {1, 2, 3, 4, 5};
		miniMaxSum(arr);
		miniMaxSum(arr2);
	}

}
