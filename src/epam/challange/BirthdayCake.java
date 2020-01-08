package epam.challange;

import java.util.Arrays;

public class BirthdayCake {

	public static void main(String[] args) {
		int[] candles = new int[100000];
		for(int i = 0; i < candles.length; i++) {
			candles[i] = 1;
		}
		blowCandles(candles);
	}

	private static void blowCandles(int[] candles) {
		Arrays.sort(candles);
		int index = candles.length-1;
		int counter = 0;
		while(candles[index] == candles[candles.length-1]) {
			counter++;
			if(index == 0) break;
			index--;
		}
		System.out.println(counter);
	}

}
