package staticblock;

import java.util.Scanner;

public class Solution {
	static int B;
	static int H;
	static boolean flag = false;
	
	static void checkPositive() throws Exception {
		if(B < 1 || H < 1) {
			throw new Exception("Breadth and height must be positive");
		} else {
			flag = true;
		}
	}
	static {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		try {
			checkPositive();
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

	public static void main(String[] args) {
		
		if(flag){
			int area=B*H;
			System.out.print(area);
		} 
	}

}
