package problemsolving.beautifultriplets;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the beautifulTriplets function below.
    static int beautifulTriplets(int d, int[] arr) {
    	int counter = 0;
    	for(int i = 0; i < arr.length-2; i++) {
    		boolean foundD = false;
    		boolean found2D = false;
    		for(int j = arr.length-1; j > i; j--) {
    			if(arr[j] - arr[i] < d) break;
    			if(arr[j] - arr[i] == d*2) found2D = true;
    			if(arr[j] - arr[i] == d) foundD = true;
    		}
    		if(foundD && found2D) counter++;
    		
    	}
    	return counter;
    }


    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(
    			new FileReader("triplets.txt"));
        Scanner scanner = new Scanner(br);
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = beautifulTriplets(d, arr);

        System.out.println(String.valueOf(result));

        scanner.close();
        br.close();
    }
}
