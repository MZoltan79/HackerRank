package problemsolving.absolutepermutation;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Solution {

    // Complete the absolutePermutation function below.
    static int[] absolutePermutation(int n, int k) {
    	if(k == 0) return IntStream.rangeClosed(1, n).toArray();
    	if(n % 2 == 0 && n % (2 * k) == 0) {
    		int res[] = new int[n];
    		int index = 0, actual = k, sequences = n / k;
    		for(int i = 0; i < sequences; i++) {
    			for(int j = 0; j < k; j++) {
    				res[index++] = ++actual;
    			}
    			if(i % 2 == 0) {
    				actual -= 2 * k;
    			} else {
    				actual += 2 * k;
    			}
    		}
    		return res;
    	}

    	return new int[] {-1};
    }


    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("AbsPermutation.txt"));
    	Scanner scanner = new Scanner(br);

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int[] result = absolutePermutation(n, k);

//            for (int i = 0; i < result.length; i++) {
//                System.out.print(result[i]);
//
//                if (i != result.length - 1) {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
            int end = result.length-1;
            if(result.length > 1) {
            	System.out.println(result[0] + " " + result[1] + " " + result[2] + " " + result[3] +
            			" ... " + result[end-3] + " " + result[end-2] + " " + result[end-1] + " " + result[end]);
            } else {
            	System.out.println(result[0]);
            }
        }
        scanner.close();
        br.close();
    }
}
