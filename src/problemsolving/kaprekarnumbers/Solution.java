package problemsolving.kaprekarnumbers;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {
    	boolean invalidRange = true;
    	for(; p <= q; p++) {
    		BigInteger bi = new BigInteger(Long.toString(p));
    		String num = bi.pow(2).toString();
    		if(p == 1) {
    			invalidRange = false;
    			System.out.print(bi.intValue() + " ");
    		} else if(Long.parseLong(num) < 10) {
    			continue;
    		} else {
    			long result = Long.parseLong(num.substring(0,(num.length()/2))) + Long.parseLong(num.substring(num.length()/2)) ;
    			if(result == p) {
    				invalidRange = false;
    				System.out.print(result + " ");
    			}
    		}
    	}
    	if(invalidRange) System.out.println("INVALID RANGE");
    }


    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}
