package javacore.arrays;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GameWithArray {
	
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
		
//		int[] game = {0, 0, 1, 0, 0, 1, 1, 0, 1};
//		int[] game = {0, 1, 1, 0, 0, 1, 1, 0, 1};
//		System.out.println(canWeWin(new int[] {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1 }, 1));
		BufferedReader br;
		PrintWriter pw;
		try {
			pw = new PrintWriter(new FileWriter(new File("testCaseSolution.txt")));
			br = new BufferedReader(new FileReader("game.txt"));
			Scanner sc = new Scanner(br);
			int[] game = null;
			int queries = sc.nextInt();
			System.out.println(queries);
			for(int j = 0; j < queries; j++ ) {
				int i = 0;
				int leap = 0;
				game = new int[sc.nextInt()];
				leap = sc.nextInt();
				while(true) {
					if(i == game.length) break;
					game[i] = sc.nextInt();
//					System.out.print(game[i] + " ");
					i++;
				}
//				System.out.print((j+1)+" " );
//				System.out.println(canWeWin(game, leap, 0)? "YES":"NO");
			pw.println(canWeWin(game, leap, 0, 0)? "YES":"NO");
			}
			br.close();
			pw.close();
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
