package problemsolving.cavitymap;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the cavityMap function below.
    static String[] cavityMap(String[] grid) {
    	String[] result = new String[grid.length];
    	Arrays.fill(result, "");
    	boolean[][] flag = new boolean[grid.length][grid.length];
    	for(int i = 1; i < grid.length-1; i++) {
    		for(int j = 1; j < grid[i].length()-1; j++) {
    			if(grid[i].charAt(j) > grid[i].charAt(j-1) && grid[i].charAt(j) > grid[i].charAt(j+1)
    			&& grid[i].charAt(j) > grid[i-1].charAt(j) && grid[i].charAt(j) > grid[i+1].charAt(j)) {
    				flag[i][j] = true;
    			}
    		}
    	}
    	for(int i = 0; i < grid.length; i++) {
    		for(int j = 0; j < grid[i].length(); j++) {
    			if(flag[i][j]) {
    				result[i] += 'X';
    			} else {
    				result[i] += grid[i].charAt(j);
    			}
    		}
    	}
    	return result;
    }


    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new FileReader("cavitymap.txt"));
    	Scanner scanner = new Scanner(br);

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

            
        }
        scanner.close();
        br.close();
    }
}
