package javacore.bigint;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

	public static void main(String[] args) {
		
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("JavaBigInteger.txt"));
			Scanner sc = new Scanner(br);
			
			BigInteger a = new BigInteger(sc.nextLine());
			BigInteger b = new BigInteger(sc.nextLine());
			
			System.out.println(a.add(b));
			System.out.println(a.multiply(b));
			
			
			br.close();
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
