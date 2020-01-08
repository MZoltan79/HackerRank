package problemsolving.threedsurface;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the surfaceArea function below.
    static int surfaceArea(int[][] A) {
    	int H = A.length, W = A[0].length;
    	
    	// top & bottom surfaces
    	int res = 2 * H * W;
    	
    	for(int i = 0; i < H; i++) {
    		for(int j = 0; j < W; j++) {
    			
    			// add all 4 sides of each cube
    			res += 4 * A[i][j];				
    			
    			// remove unnecessary sides of each cube
    			res -= i != 0? 2 * Math.min(A[i-1][j], A[i][j]): 0; 	
    			res -= j != 0? 2 * Math.min(A[i][j-1], A[i][j]): 0;
    		}
    	}
    	return res;
    }


    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new FileReader("3Dsurface.txt"));
        Scanner scanner = new Scanner(br);
        String[] HW = scanner.nextLine().split(" ");

        int H = Integer.parseInt(HW[0]);

        int W = Integer.parseInt(HW[1]);

        int[][] A = new int[H][W];

        for (int i = 0; i < H; i++) {
            String[] ARowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < W; j++) {
                int AItem = Integer.parseInt(ARowItems[j]);
                A[i][j] = AItem;
            }
        }

        int result = surfaceArea(A);

        System.out.println(result);
        scanner.close();
        br.close();
    }
}
