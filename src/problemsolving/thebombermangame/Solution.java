package problemsolving.thebombermangame;

import java.io.*;
import java.util.*;

public class Solution {
	
	static void printArray(char[][] board) {
		for(char[] array: board) {
			for(char c: array) {
//				System.out.print(c == '.'? c:'O');
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println();
	}

    // Complete the bomberMan function below.
    static String[] bomberMan(int n, String[] grid) {
    	int end = n;
    	if(n > 4) end = n % 4 == 0? 8:4 + n % 4;
    	char[][] board = new char[grid.length][];
    	boolean[][] flag = new boolean[grid.length][grid[0].length()];
    	for(int i = 0; i < grid.length; i++) {
    		grid[i] = grid[i].replace('O', '0');
    		board[i] = grid[i].toCharArray();
    	}
    	for(int i = 0; i < end; i++) {
    		for(boolean[] b: flag) Arrays.fill(b, false);
    		for(int j = 0; j < board.length; j++) {
    			for(int k = 0; k < board[j].length; k++) {
    				if(board[j][k] != '.') {
    					board[j][k] = (char)(board[j][k] + 1);
    				}
    				if(i > 0 && i % 2 == 1 && board[j][k] == '.') {
    					board[j][k] = '0';
    				}
    				if(board[j][k] == '3') {
    					flag[j][k] = true;
    					if(board.length > 1) {
    						if(j == 0) {
    							flag[j+1][k] = true;
    						} else if(j == board.length-1) {
    							flag[j-1][k] = true;
    						} else {
    							flag[j+1][k] = true;
    							flag[j-1][k] = true;
    						}
    					}
    					if(board[j].length > 1) {
    						if(k == 0) {
    							flag[j][k+1] = true;
    						} else if(k == board[j].length-1) {
    							flag[j][k-1] = true;
    						} else {
    							flag[j][k+1] = true;
    							flag[j][k-1] = true;
    						}
    					}
    				}
    			}
    		}
    		for(int j = 0; j < board.length; j++) {
    			for(int k = 0; k < board[j].length; k++) {
    				if(flag[j][k]) {
    					board[j][k] = '.';
    				}
    			}
    		}
    	}
    	Arrays.fill(grid, "");
    	for(int i = 0; i < board.length; i++) {
    		for(int j = 0; j < board[i].length; j++) {
    			if(board[i][j] != '.') {
    				board[i][j] = 'O';
    			}
    			grid[i] += board[i][j];
    			
    		}
    	}
    	return grid;
    }


    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("bomberman.txt"));
    	Scanner scanner = new Scanner(br);

        String[] rcn = scanner.nextLine().split(" ");

        int r = Integer.parseInt(rcn[0]);

//        int c = Integer.parseInt(rcn[1]);

        int n = Integer.parseInt(rcn[2]);

        String[] grid = new String[r];

        for (int i = 0; i < r; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = bomberMan(n, grid);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

            if (i != result.length - 1) {
                System.out.println();
            }
        }
        System.out.println();
        scanner.close();
        br.close();
    }
}
