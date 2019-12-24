package problemsolving.leaderboard;

import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;

public class Solution {

	// Complete the climbingLeaderboard function below.
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		int[] result = new int[alice.length];
		int maxRank = 2;
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] != scores[i - 1]) {
				maxRank++;
			}
		}
		int tmp = scores.length - 1;
		int rank = maxRank;
		for (int i = 0; i < alice.length; i++) {
			int last = 0;
			while (tmp >= 0 && alice[i] >= scores[tmp]) {
				rank--;
				if (scores[tmp] == last) {
					rank++;
				}
				last = scores[tmp];
				tmp--;
			}
			result[i] = rank;
		}
		return result;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("leaderboard6.txt"));
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

		for (int i = 0; i < result.length; i++) {
			System.out.println(String.valueOf(result[i]));

		}

		scanner.close();
		
	}
}
