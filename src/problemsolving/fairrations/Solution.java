package problemsolving.fairrations;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the fairRations function below.
    static int fairRations(int[] B) {
    	int result = 0;
    	if(Arrays.stream(B).sum() % 2 == 1) {
    		return -1;
    	} else {
    		for(int i = 0; i < B.length; i++) {
    			if(B[i] % 2 != 0) {
    				B[i]++;
    				B[i+1]++;
    				result += 2;
    			}
    		}
    	}
        return result;
    }


    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("fairrations.txt"));
    	Scanner scanner = new Scanner(br);

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] B = new int[N];

        String[] BItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < N; i++) {
            int BItem = Integer.parseInt(BItems[i]);
            B[i] = BItem;
        }

        int result = fairRations(B);

        System.out.println(result);

        scanner.close();
        br.close();
    }
}
