package problemsolving.leaderboard;

import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;

public class Solution2 {

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
    	long start = System.currentTimeMillis();
        int[] result = new int[alice.length];
        int maxRank = 2;
        for(int i = 1; i < scores.length; i++){
          if(scores[i] != scores[i-1]){
            maxRank++;
          }
        }
        int rank = maxRank;
        int cursor = scores.length-1;
        for(int i = 0; i < alice.length; i++) {
        	while(cursor >= 0 && alice[i] >= scores[cursor]) {
        		boolean flag = false;
        		do {
        			cursor--;
        			if(!flag) {
//        				rank = Math.max(1, rank-1);
        				rank--;
        				flag = true;
        			}
        		} while(cursor> 0 && scores[cursor+1] == scores[cursor]);
        	}
          result[i] = rank;
        }
        System.out.println("Ellapsed time in millies: " + (System.currentTimeMillis()-start));
        return result;

    }


    public static void main(String[] args) throws IOException {
//    	PrintWriter pw = new PrintWriter(
//    			new FileWriter(new File("solution2.txt")));
    	BufferedReader br = new BufferedReader(
    			new FileReader("leaderboard6.txt"));
    	Scanner scanner = new Scanner(br);
        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

//        for (int i = 0; i < result.length; i++) {
//            pw.println(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                System.out.println("\n");
//            }
//        }
        for(int i: result) System.out.println(i);


        scanner.close();
    }
}
