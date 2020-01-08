package problemsolving.containersofballs;

import java.io.*;

import java.util.*;


public class Solution {

    // Complete the organizingContainers function below.
    static String organizingContainers(int[][] container) {

    	return "";
    }

    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
							new FileReader("container.txt"));
        Scanner scanner = new Scanner(br);
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[][] container = new int[n][n];

            for (int i = 0; i < n; i++) {
                String[] containerRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowItems[j]);
                    container[i][j] = containerItem;
                }
            }

            String result = organizingContainers(container);

            System.out.println(result);
        }


        scanner.close();
        br.close();
    }
}

