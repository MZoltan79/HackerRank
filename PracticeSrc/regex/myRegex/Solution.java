package regex.myRegex;

import java.util.Scanner;

public class Solution {
	
	private static class MyRegex {
		final String pattern = "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
				+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
				+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
				+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
		
	}

	 public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        String IP = "";
	        while(!(IP = in.next()).equals("exit")){
	            System.out.println(IP.matches(new MyRegex().pattern));
	        }

	    }
}
