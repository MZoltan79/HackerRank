package tendaysofstat.geometricdistribution1;

public class Solution {

	public static void main(String[] args) {
		double p = 1.0/3.0;
		double q = 1-p;
		
		double res = Math.pow(q, 4.0);
		System.out.println(p);
		System.out.println(q);
		System.out.println(res);
		System.out.printf("%.3f %n", res*p);

	}

}
