package stdoutstdin2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
		scan.nextLine();
		String s = scan.nextLine();
		scan.close();
		
		System.out.println(s);
		System.out.println(d);
		System.out.println(i);
		

	}

}
