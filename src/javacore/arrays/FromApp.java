package javacore.arrays;

public class FromApp {

	private static boolean canWeWin(int[] game, int leap, int currentPos, int lastPos) {
		boolean didWin = false;
		int pos = currentPos;
		while(pos < game.length-1 && game[pos+1] == 0) {
			pos++;
		}
		if(pos == game.length-1) return true;
		int prevPos = pos;
		while(prevPos > lastPos && game[prevPos-1] == 0 && prevPos+leap > pos+1) {
			prevPos--;
		}
		currentPos = prevPos;
		for(int i = currentPos; i <= pos; i++) {
			if(i+leap < game.length && game[i+leap] == 0 && leap != 0 ) {
				didWin = canWeWin(game, leap, i+leap, i);
			}
			
			if(didWin || i+leap >= game.length || i+1 >= game.length) {
				didWin = true;
				break;
			}
		}
		return didWin;
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
		System.out.println(canWeWin(game, leap, 0, 0));
	}


}
