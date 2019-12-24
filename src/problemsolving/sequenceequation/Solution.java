package problemsolving.sequenceequation;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
    	int[] result = new int[p.length];
    	List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < p.length; i++) {
        	list.add(p[i]);
        }
        for(int i = 1; i <= p.length; i++) {
        	result[i-1] = (list.indexOf(list.indexOf(i)+1)+1);
        }
    	return result;
    }


    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(
    						new FileReader("subseq.txt"));
    	Scanner scanner = new Scanner(br);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);

        for (int i = 0; i < result.length; i++) {
           System.out.println(String.valueOf(result[i]));

        }


        scanner.close();
    }
}
