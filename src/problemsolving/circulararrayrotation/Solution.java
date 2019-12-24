package problemsolving.circulararrayrotation;

import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;

public class Solution {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
    	int rc = k % a.length; // rotation count
    	int[] temp = new int[a.length];
    	int[] result = new int[queries.length];
    	for(int i = 0; i < a.length; i++) {
    		temp[i] = i < rc? a[a.length-rc+i]:a[i-rc];
    	}
    	for(int i = 0; i < queries.length; i++) {
    		result[i] = temp[queries[i]];
    	}
    	return result;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
        					new FileReader("rotation.txt"));

        Scanner scanner = new Scanner(br);
        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        int[] result = circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.length; i++) {
            System.out.println(String.valueOf(result[i]));

        }
//        System.out.println(5%3);
        scanner.close();
        br.close();
    }
}
