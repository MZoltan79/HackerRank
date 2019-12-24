package problemsolving.hurdlerace;

import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;

public class Solution {

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
    	int result = 0;
    	for(int i: height) {
    		if(i - k > result) {
    			result = i-k;
    		}
    	}
    	return result;
    }


    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(
    						new FileReader("hurdlerace.txt"));
    	Scanner scanner = new Scanner(br);

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] height = new int[n];

        String[] heightItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightItems[i]);
            height[i] = heightItem;
        }

        int result = hurdleRace(k, height);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
}
