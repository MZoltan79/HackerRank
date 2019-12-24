package javacore.arrays;

public class Solution {
	
	private static boolean canWeWin(int[] game, int leap, int startPosition) {
		int n = game.length;
		int sp = startPosition;
		System.out.println(sp);
		if(sp+leap >= n) return true;
		if((sp > 0 && sp+leap-1 >= n) && game[sp-1] == 0) return true; 
		if(game[sp+1] == 0 && canWeWin(game, leap, sp+1)) {
			return true;
		}
		if(game[sp+leap] == 0 && canWeWin(game, leap, sp+leap)) {
			return true;
		}
		int prev = sp;
		while(game[prev] == 0 && prev > 0) {
			if(game[prev+leap] == 0 && canWeWin(game, leap, prev+leap)) {
				return true;
			} else {
				prev--;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		int[] game = {0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0,
				0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0,
				0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0};
		
		int leap = 3;
//		int[] game = {0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1,
//				1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0};
//		
//		int leap = 16;
//		int[] game = {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1};
//
//		int leap = 5;
		System.out.println(canWeWin(game, leap, 0));

	}

}
