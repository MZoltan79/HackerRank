package problemsolving.flatlandspacestations;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
    	if(c.length == 1) return Math.max(c[0], Math.abs((n-1)-c[0]));
    	Arrays.sort(c);
    	int result = c[0];
    	int minDiff = 0;
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < c.length-1; j++) {
    			if(i < c[j]) continue;
    			if(i > c[j] && i < c[j+1]) {
    				minDiff = Math.min(Math.abs(i-c[j]), Math.abs(i-c[j+1]));
    				if(minDiff > result) {
    					result = minDiff;
    				}
    			}
    		}
    	}
    	return Math.max(result, n-c[c.length-1]-1);
    }


    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("flatland.txt"));
    	Scanner scanner = new Scanner(br);

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }
        int result = flatlandSpaceStations(n, c);
        System.out.println(result);

        scanner.close();
        br.close();
    }
}
