package problemsolving.magicsquare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Tester {
	static void printMs(int[][] ms) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(ms[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	static int[][] copyMs(int[][] ms) {
		int[][] copy = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				copy[i][j] = ms[i][j];
			}
		}
		return copy;
	}
	
	static void mirrorMs(int[][] ms) {
		int[] temp = ms[0];
		ms[0] = ms[2];
		ms[2] = temp;
	}
	
	static void rotateMs(int[][] ms) {
		int[][] temp = copyMs(ms);
		ms[0][0] = temp[2][0];
		ms[0][1] = temp[1][0];
		ms[0][2] = temp[0][0];
		ms[1][0] = temp[2][1];
		ms[1][2] = temp[0][1];
		ms[2][0] = temp[2][2];
		ms[2][1] = temp[1][2];
		ms[2][2] = temp[0][2];
		
	}
	
	static int compareSquares(int[][] tc, int[][] ms) {
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				sum += Math.abs(ms[i][j] - tc[i][j]);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		List<Integer> results = new ArrayList<Integer>();
		int[][] tc = {{4,8,2},{4,5,7},{6,1,6}};
		int[][] ms = {{2,7,6},{9,5,1},{4,3,8}};
		for(int i = 0; i < 4; i++) {
			rotateMs(tc);
			mirrorMs(tc);
			results.add(compareSquares(tc, ms));
			mirrorMs(tc);
			results.add(compareSquares(tc, ms));
		}
		Collections.sort(results);
		System.out.println(results.get(0));
//		System.out.println(results);

	}

}
