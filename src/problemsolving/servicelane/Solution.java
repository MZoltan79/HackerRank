package problemsolving.servicelane;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the serviceLane function below.
    static int[] serviceLane(int[][] cases, int[] width) {
    	int[] result = new int[cases.length];
    	for(int i = 0; i < cases.length; i++) {
    		List<Integer> subList = new ArrayList<Integer>();
    		for(int j = cases[i][0]; j <= cases[i][1]; j++) {
    			subList.add(width[j]);
    		}
    		Collections.sort(subList);
    		result[i] = subList.get(0);
    	}
    	return result;
    }


    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new FileReader("servicelane.txt"));

        Scanner scanner = new Scanner(br);

        String[] nt = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nt[0]);

        int t = Integer.parseInt(nt[1]);

        int[] width = new int[n];

        String[] widthItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int widthItem = Integer.parseInt(widthItems[i]);
            width[i] = widthItem;
        }

        int[][] cases = new int[t][2];

        for (int i = 0; i < t; i++) {
            String[] casesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int casesItem = Integer.parseInt(casesRowItems[j]);
                cases[i][j] = casesItem;
            }
        }

        int[] result = serviceLane(cases, width);

        for (int i = 0; i < result.length; i++) {
            System.out.println(String.valueOf(result[i]));

        }
        scanner.close();
        br.close();
    }
}
