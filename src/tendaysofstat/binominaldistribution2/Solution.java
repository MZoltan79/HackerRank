package tendaysofstat.binominaldistribution2;

public class Solution {
	
	static int factorial(int n) {
		if (n == 0) return 1;
		return n * factorial(n - 1);
	}
	
	static double combination(int n, int p) {
		return (factorial(n) / (factorial(p) * factorial(n - p)));
	}
	
	static double probability(int n, int x, double p) {
		return combination(n, x) * Math.pow(p, x) * Math.pow(1-p, n-x);
	}

	public static void main(String[] args) {
		double p = 0.12;
		int n = 10;
		
		// no more than 2
		double res1 = 0;
		for(int i = 0; i <= 2; i++) {
			res1 += probability(n, i, p);
		}
		
		// at least 2
		double res2 = 1;
		res2 -= probability(n, 0, p) + probability(n, 1, p);
		
		System.out.printf("%.3f %n", res1);
		System.out.printf("%.3f %n", res2);
	}

}
