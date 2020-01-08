package tendaysofstat.geometricdistribution2;

public class Solution {

	public static void main(String[] args) {
		double p = 1.0/3.0;
		double q = 1-p;
		
		double res = 0;
		for(double d = 0; d < 5; d++) {
			res += Math.pow(q, d) * p;
			
		}
		
		
		System.out.printf("%.3f %n", res);

	}

}
