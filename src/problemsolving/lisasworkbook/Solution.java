package problemsolving.lisasworkbook;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the workbook function below.
    static int workbook(int n, int k, int[] arr) {
    	int result = 0;
    	int page = 0;
    	int taskPerPage = 0;
    	for(int i = 0; i < n; i++) {
    		page++;
    		taskPerPage = 0;
    		for(int j = 0; j < arr[i]; j++) {
    			taskPerPage ++;
    			if(taskPerPage == k+1) {
    				taskPerPage = 1;
    				page++;
    			}
//    			System.out.println("chapter: " + (i+1) + " page: " + page + " task: " + (j+1));
    			if(page == j+1) result++;
    		}
    	}
    	return result;
    }


    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("lisasworkbook.txt"));
    	Scanner scanner = new Scanner(br);

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = workbook(n, k, arr);

        System.out.println(String.valueOf(result));
        scanner.close();
        br.close();
    }
}
