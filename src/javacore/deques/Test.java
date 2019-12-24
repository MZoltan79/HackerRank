package javacore.deques;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    	BufferedReader br;
    	try {
			br = new BufferedReader(new FileReader("deque.txt"));
			Scanner in = new Scanner(br);
			Deque<Integer> deque = new ArrayDeque<>();
			int n = in.nextInt();
			int m = in.nextInt();
			
			for (int i = 0; i < 3; i++) {
				int num = in.nextInt();
				deque.add(num);
				if(deque.size() > 2) {
					deque.removeFirst();
					Map<Integer, Integer> map = new HashMap<Integer, Integer>();
					for(int j = 0; j  < deque.size(); j++) {
						if(!map.containsKey(num)) {
							map.put(num, 1);
						} else {
							map.put(num, map.get(num) + 1);
						}
					}
					System.out.println(map);
				}
					
				
			}
			br.close();
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

