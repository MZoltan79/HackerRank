package problemsolving.minimumdistance;

import java.io.*;
import java.util.*;
//import java.util.Map.Entry;

public class Solution {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
    	long start = System.currentTimeMillis();
    	List<Integer> distances = new ArrayList<Integer>();
    	for(int i = 0; i < a.length-1; i++) {
    		for(int j = i+1; j < a.length; j++) {
    			if(a[j] == a[i]) {
    				distances.add(j-i);
    			}
    		}
    	}
    	System.out.println("elapsed time: " + (System.currentTimeMillis()-start));
    	return distances.isEmpty()? -1:distances.stream().mapToInt(x -> x).min().getAsInt();
    }
    
    static int minimumDistances2(int[] a) {
    	long start = System.currentTimeMillis();
    	int minDistance = a.length-1;
    	for(int i = 0; i < a.length-1; i++) {
    		for(int j = i+1; j < a.length; j++) {
    			if(a[j] == a[i] && j - i < minDistance) {
    				minDistance = j - i;
    			}
    		}
    	}
    	System.out.println("elapsed time: " + (System.currentTimeMillis()-start));
    	return minDistance == a.length-1? -1:minDistance;
    }


    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(
    			new FileReader("distances.txt"));
    	Scanner scanner = new Scanner(br);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

       

        System.out.println(minimumDistances(a));
        System.out.println(minimumDistances2(a));
        scanner.close();
        br.close();
    }
}
