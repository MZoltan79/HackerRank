package problemsolving.jumpingontheclouds;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
    	int e = 100;
    	int n = c.length;
    	int i = 0;
    	while(true) {
    		e -= c[i]==1? 3:1;
    		i += k;
    		if(i % n == 0) break;
    		if(i > n) i = i % (n);
    		System.out.println(i);
    	}
    	return e;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
        					new FileReader("jumping.txt"));
        Scanner scanner = new Scanner(br);

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c, k);

        System.out.println((String.valueOf(result)));
        scanner.close();
        br.close();
    }
}
