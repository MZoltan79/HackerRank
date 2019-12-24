package javacore.lists;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
    	BufferedReader br;
    	try {
			br = new BufferedReader(new FileReader("stdin.txt"));
			Scanner sc = new Scanner(br);
			List<List<Integer>> lines = new ArrayList<>();
			int x = sc.nextInt();
			sc.nextLine();
			for(int i = 0; i < x; i++){
				String s = sc.nextLine();
				String[] temp = s.split(" ");
				List<Integer> line = new ArrayList<>();
				for(int j = 0; j < Integer.parseInt(temp[0]); j++){
					line.add(Integer.parseInt(temp[j+1]));
				}
				lines.add(line);
			}
			x = sc.nextInt();
			sc.nextLine();
			for(int i = 0; i < x; i++) {
				String s = sc.nextLine();
				int[] temp = {Integer.parseInt(s.split(" ")[0]), Integer.parseInt(s.split(" ")[1])};
				if(lines.size() >= temp[0] && lines.get(temp[0]-1).size() >= temp[1]){
					System.out.println(lines.get(temp[0]-1).get(temp[1]-1));
				} else {
					System.out.println("ERROR!");
				}
			}
			sc.close();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}