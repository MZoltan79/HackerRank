package problemsolving.plusminus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	int positives = 0;
    	int negatives = 0;
    	int zeros = 0;
    	for(int i: arr) {
    		if(i > 0) {
    			positives++;
    		} else if(i < 0) {
    			negatives++;
    		} else {
    			zeros++;
    		}
    	}
    	System.out.printf("%f %n", (double)positives/arr.length);
    	System.out.printf("%f %n", (double)negatives/arr.length);
    	System.out.printf("%f %n", (double)zeros/arr.length);

    }
    
  
    public static void main(String[] args) {
    	BufferedReader br = null;
    	try {
			br = new BufferedReader(new FileReader("plusminus.txt"));
			Scanner scanner = new Scanner(br);
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			
			int[] arr = new int[n];
			
			String[] arrItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			
			for (int i = 0; i < n; i++) {
				int arrItem = Integer.parseInt(arrItems[i]);
				arr[i] = arrItem;
			}
			
			plusMinus(arr);
			
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
}
