package javacore.arrays;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SolutionTester {
	
	private static void fillMySolution(ArrayList<String> mySolution) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("testCaseSolution.txt"));
		while(br.ready()) {
			mySolution.add(br.readLine());
		}
		br.close();
	}

	private static void fillSolution(ArrayList<String> solution) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("testCase.txt"));
		while(br.ready()) {
			solution.add(br.readLine());
		}
		br.close();
	}
	
	private static void printDifferences(ArrayList<String> mySolution,ArrayList<String> solution) {
		if(solution.size() !=  mySolution.size()) {
			System.out.println("error! list's sizes are different");
			return;
		}
		int counter = 0;
		for(int i = 0; i < solution.size();i++) {
			if(!solution.get(i).equals(mySolution.get(i))) {
				counter++;
				System.out.println("Row " + (i+1) + ". - my: " + mySolution.get(i) + " - " + solution.get(i));
			}
		}
		if(counter == 0) System.out.println("Success!!!");
				
	}

	public static void main(String[] args) {
		
		ArrayList<String> mySolution = new ArrayList<>();
		ArrayList<String> solution = new ArrayList<>();
		try {
			fillMySolution(mySolution);
			fillSolution(solution);
			printDifferences(mySolution, solution);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
