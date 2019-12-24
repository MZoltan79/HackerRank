package problemsolving.leaderboard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tester {

	static final StringBuffer sb1 = new StringBuffer();
	static final StringBuffer sb2 = new StringBuffer();
	public static void main(String[] args) throws IOException {
		
		BufferedReader output6 = new BufferedReader(
				new FileReader("output06.txt"));
		BufferedReader solution2 = new BufferedReader(
				new FileReader("solution2.txt"));
		List<Integer> output = new ArrayList<Integer>();
		List<Integer> solution = new ArrayList<Integer>();
		while(output6.ready()) {
			output.add(Integer.parseInt(output6.readLine()));
		}
		while(solution2.ready()) {
			solution.add(Integer.parseInt(solution2.readLine()));
		}
		System.out.println(output.size());
		System.out.println(solution.size());
		
		
		        new Thread() {
		            public void run() {
		                synchronized(sb1) {
		                    sb1.append("A");
		                    sb2.append("B");
		                }
		            }
		        }.start();

		        new Thread() {
		            public void run() {
		                synchronized(sb1) {
		                    sb1.append("C");
		                    sb2.append("D");
		                }
		            }
		        }.start();
		    System.out.println(sb1 + " " + sb2);
	}

}
