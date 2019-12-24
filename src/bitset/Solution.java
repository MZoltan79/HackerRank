package bitset;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.BitSet;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("bitsets.txt"));
			Scanner sc = new Scanner(br);
			int n = sc.nextInt();
			int m = sc.nextInt();
			BitSet b1 = new BitSet(n);
			BitSet b2 = new BitSet(n);
			for(int i = 0; i < m; i++) {
				sc.nextLine();
				String op = sc.next();
				int x = sc.nextInt();
				int y = sc.nextInt();
				switch(op) {
				case "AND": 
					if(x < y) {
						b1.and(b2);
					} else {
						b2.and(b1);
					}
					break;
				case "OR":
					if(x < y) {
						b1.or(b2);
					} else {
						b2.or(b1);
					}
					break;
				case "XOR": 
					if(x < y) {
						b1.xor(b2);
					} else {
						b2.xor(b1);
					}
					break;
				case "SET":
					if(x == 1) {
						b1.set(y);
					} else {
						b2.set(y);
					}
					break;
				case "FLIP":
					if(x == 1) {
						b1.flip(y);
					} else {
						b2.flip(y);
					}
					break;
				}
				System.out.println(b1.cardinality() + " " + b2.cardinality());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
