package problemsolving.chocolatefeast;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the chocolateFeast function below.
    static int chocolateFeast(int n, int c, int m) {
    	int result = n/c;
    	int wrappers = result;
    	while(wrappers >= m) {
    		int temp = wrappers/m;
    		result += temp;
    		wrappers = wrappers%m;
    		wrappers += temp;
    	}
    	return result;
    }

    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("chocolatefeast.txt"));
    	Scanner scanner = new Scanner(br);

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] ncm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(ncm[0]);

            int c = Integer.parseInt(ncm[1]);

            int m = Integer.parseInt(ncm[2]);

            int result = chocolateFeast(n, c, m);

            System.out.println(String.valueOf(result));
        }


        scanner.close();
        br.close();
    }
}
