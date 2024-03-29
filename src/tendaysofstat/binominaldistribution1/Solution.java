package tendaysofstat.binominaldistribution1;

public class Solution {

	public static final double BR = 1.09;
	public static final double GR = 1;

	static int factorial(int n) {
		if (n == 0) return 1;
		return n * factorial(n - 1);
	}

	static double combination(int r) {
		return (factorial(6) / (factorial(r) * factorial(6 - r)));
	}

	public static void main(String[] args) {
		double p = 1.09 / 2.09;
		double q = 1 - p;

		double probability = 0.0;
		for (int i = 6; i >= 3; i--) {
			probability += combination(i) * Math.pow(p, i) * Math.pow(q, 6 - i);
		}
		System.out.printf("%.3f", probability);
	}

	

}
