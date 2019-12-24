package epam.challange;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("How many numbers should contain the array?");
		int[] arrayOfIntegers = new int[scan.nextInt()];
		System.out.println("Okay, here is your array, contains ints from range [-2 - 2]:");
		for(int i = 0; i < arrayOfIntegers.length; i++) {
			arrayOfIntegers[i] = rand.nextInt(5)-2;
			System.out.print(arrayOfIntegers[i] + ", ");
		}
		scan.close();
		System.out.println();
		double zeros = 0;
		double positives = 0;
		double negatives = 0;
		for(int i: arrayOfIntegers) {
			if(i == 0) {
				zeros++;
			} else if(i > 0) {
				positives++;
			} else {
				negatives++;
			}
		}
		zeros = zeros/arrayOfIntegers.length;
		positives = positives/arrayOfIntegers.length;
		negatives = negatives/arrayOfIntegers.length;
		System.out.printf(Locale.US,"%f %n", positives);
		System.out.printf(Locale.US,"%f %n", negatives);
		System.out.printf(Locale.US,"%f %n", zeros);
	}

}
